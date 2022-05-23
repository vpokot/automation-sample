package com.cnh.test.jobcard;

import com.cnh.test.BaseTest;
import com.cnh.test.report.AllureLog;
import soap.getpartsmaster.GetPartsMasterProcessor;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetPartsMasterTest extends BaseTest {

    private final String SOAP_ACTION = "http://cnh.capgemini.com/jobcard-dms/getPartsMaster";
    private final String URL = "api/SoapToJsonToDataLake";
    private final Map<String, String> REQUEST_PARAMS = Map.of(
            "sapCode", "666",
            "providerName", "testProvider",
            "request", "true"
    );

    @BeforeMethod
    public void setup() {
        addSoapActionHeader(SOAP_ACTION);
        requestSpecification.queryParams(REQUEST_PARAMS);
    }

    @Test
    public void getPartsMaster() {
        String payload = new GetPartsMasterProcessor().generateSoapPayload();

        AllureLog.log("POST Soap data to DataLake");
        Response response = given()
                .spec(requestSpecification)
                .body(payload)
                .post(URL);
        AllureLog.log("Response should have status code [200]");
        response.then().statusCode(HttpStatus.SC_OK);
    }
}
