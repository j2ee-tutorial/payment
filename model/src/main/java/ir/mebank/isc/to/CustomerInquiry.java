package ir.mebank.isc.to;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_INQUIRY")
@SequenceGenerator(name = "SEQUENCE_GENERATOR", sequenceName = "CUSTOMER_INQUIRY_SEQ")
public class CustomerInquiry extends EntityBase {

    private String sourceCardNumber;

    private String destinationCardNumber;

    public String getSourceCardNumber() {
        return sourceCardNumber;
    }

    public void setSourceCardNumber(String sourceCardNumber) {
        this.sourceCardNumber = sourceCardNumber;
    }

    public String getDestinationCardNumber() {
        return destinationCardNumber;
    }

    public void setDestinationCardNumber(String destinationCardNumber) {
        this.destinationCardNumber = destinationCardNumber;
    }
}
