package com.cnh.test;

import com.cnh.test.properties.DefaultConfig;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeMethod;

import static org.apache.http.HttpHeaders.AUTHORIZATION;

public class BaseTest {
    protected DefaultConfig config = ConfigFactory.create(DefaultConfig.class);
    protected RequestSpecification requestSpecification;

    @BeforeMethod
    public void baseTestSetup() {
        requestSpecification =  new RequestSpecBuilder()
                .setBaseUri(config.host())
                .setAccept(ContentType.ANY)
                .setContentType(ContentType.XML)
                .addFilter(new AllureRestAssured())
                .addHeader(AUTHORIZATION, config.authToken())
                .build();
    }

    protected void addSoapActionHeader(String action) {
        requestSpecification.header("SOAPAction", action);
    }
}
