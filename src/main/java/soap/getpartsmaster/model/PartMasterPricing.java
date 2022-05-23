package soap.getpartsmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class PartMasterPricing {
    private Price price;
}
