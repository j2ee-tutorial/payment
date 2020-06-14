package ir.mebank.isc.dto;

public class FundTransferResponse extends FundTransfer {
    String responseCode;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
