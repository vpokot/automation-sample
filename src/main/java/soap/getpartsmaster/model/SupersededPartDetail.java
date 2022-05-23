package soap.getpartsmaster.model;

import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class SupersededPartDetail {
    private String itemDescription;
    private String manufacturerName;
    private int manufacturerPartCode;
    private boolean multipartSession;
    private String partNumberId;
    private int partQuantity;
    private String superSessionDate;
    private String supersedingPartNumberId;
}
