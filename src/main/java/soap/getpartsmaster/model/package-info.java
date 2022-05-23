@XmlSchema(xmlns={
        @XmlNs(
                prefix="SOAP-ENV",
                namespaceURI="http://schemas.xmlsoap.org/soap/envelope/"),
        @XmlNs(
                prefix="typ",
                namespaceURI="http://cnh.capgemini.com/jobcard-dms/types"),
        @XmlNs(
                prefix="ns1",
                namespaceURI="http://cnh.capgemini.com/jobcard-dms/wsdl")
})
package soap.getpartsmaster.model;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;