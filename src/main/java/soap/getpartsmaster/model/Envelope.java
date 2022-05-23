package soap.getpartsmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="SOAP-ENV:Envelope")
@XmlAccessorType(XmlAccessType.FIELD)
public class Envelope {
    @XmlElement(name= "SOAP-ENV:Body")
    private Body body;
}
