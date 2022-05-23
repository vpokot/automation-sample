package soap.getpartsmaster.model;

import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class PartMasterLine {
    private String alternateItemId;
    private int itemQuantity;
    private String manufacturerPartCode;
    private int packageQuantity;
    private String partManufacturer;
    private PartMasterPricing partMasterPricing;
    private PartsProductItem partsProductItem;
    private SupersedingPartGroup supersedingPartGroup;
}
