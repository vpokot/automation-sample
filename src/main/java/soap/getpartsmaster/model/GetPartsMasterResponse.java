package soap.getpartsmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class GetPartsMasterResponse {
    @XmlElement(name= "typ:GetPartsMasterResponseDto")
    private GetPartsMasterResponseDto getPartsMasterResponseDto;
}
