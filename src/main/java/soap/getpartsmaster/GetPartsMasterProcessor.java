package soap.getpartsmaster;

import com.cnh.test.helpers.XmlHelper;
import soap.getpartsmaster.model.*;
import org.apache.commons.math3.random.RandomDataGenerator;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class GetPartsMasterProcessor {
    private final RandomDataGenerator random = new RandomDataGenerator();

    public String generateSoapPayload() {
        return XmlHelper.convertObjectToXml(generateSoapEnvelope());
    }

    private Envelope generateSoapEnvelope() {
        Body body = new Body(generatePartsMasterResponse());
        return new Envelope(body);
    }

    private GetPartsMasterResponse generatePartsMasterResponse() {
        var getPartsMasterResponseDto = new GetPartsMasterResponseDto(generatePartMasterLine());
        return new GetPartsMasterResponse(getPartsMasterResponseDto);
    }

    private PartMasterLine generatePartMasterLine() {
        var price = new Price(random.nextF(0.01, 10000));
        var partMasterPricing = new PartMasterPricing(price);
        var supersedingPartGroup = new SupersedingPartGroup(generateSupersededPartDetail());

        return PartMasterLine.builder()
                .alternateItemId(randomAlphanumeric(10))
                .itemQuantity(random.nextInt(1, 9999))
                .manufacturerPartCode(randomAlphanumeric(15))
                .packageQuantity(random.nextInt(1, 9999))
                .partManufacturer("VID")
                .partMasterPricing(partMasterPricing)
                .partsProductItem(generatePartsProductItem())
                .supersedingPartGroup(supersedingPartGroup)
                .build();
    }

    private PartsProductItem generatePartsProductItem() {
        var itemIdentification = new ItemIdentification(randomAlphanumeric(10));

        return PartsProductItem.builder()
                .classCode(randomAlphanumeric(10))
                .itemIdentificationGroup(new ItemIdentificationGroup(itemIdentification))
                .partDescriptions(randomAlphanumeric(10))
                .partNames(randomAlphanumeric(10))
                .partTypeCode(randomAlphanumeric(10))
                .uomCode("U")
                .build();
    }

    private SupersededPartDetail generateSupersededPartDetail() {
        return SupersededPartDetail.builder()
                .itemDescription(randomAlphanumeric(10))
                .manufacturerName("IVEKO")
                .manufacturerPartCode(random.nextInt(1, 9999))
                .multipartSession(false)
                .partNumberId(randomAlphanumeric(10))
                .partQuantity(random.nextInt(1, 9999))
                .superSessionDate("")
                .supersedingPartNumberId(randomAlphanumeric(15))
                .build();
    }
}
