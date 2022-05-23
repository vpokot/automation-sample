package soap.getpartsmaster.model;

import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class PartsProductItem {
    private String classCode;
    private ItemIdentificationGroup itemIdentificationGroup;
    private String partDescriptions;
    private String partNames;
    private String partTypeCode;
    private String uomCode;
}
