package ir.mebank.isc.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public abstract class CustomerInquiry {

    @NotNull
    @NotEmpty
    @NotBlank
    private String sourceCardNumber;

    @NotNull
    @NotEmpty
    @NotBlank
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
