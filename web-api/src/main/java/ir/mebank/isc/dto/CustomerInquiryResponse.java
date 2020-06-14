package ir.mebank.isc.dto;

public class CustomerInquiryResponse extends CustomerInquiry{
    String responseCode;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
