package ir.mebank.isc.controller;

import ir.mebank.isc.dto.CustomerInquiryRequest;
import ir.mebank.isc.dto.CustomerInquiryResponse;
import ir.mebank.isc.dto.FundTransferRequest;
import ir.mebank.isc.dto.FundTransferResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.function.Consumer;

@RestController
public class TransactionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionController.class);

    @PostMapping("/customerInquiry")
    public ResponseEntity<CustomerInquiryResponse> customerInquiry(@Valid @RequestBody CustomerInquiryRequest customerInquiryRequest, BindingResult validationResult) {
        LOGGER.info("Customer Inquiry Request");
        LOGGER.info("Source Card Number: {}", customerInquiryRequest.getSourceCardNumber());
        LOGGER.info("Destination Card Number: {}", customerInquiryRequest.getDestinationCardNumber());

        validationResult.getAllErrors().forEach(objectError -> {
            LOGGER.info(objectError.toString());
        });



        CustomerInquiryResponse customerInquiryResponse = new CustomerInquiryResponse();
        customerInquiryResponse.setResponseCode("Successful");
        return ResponseEntity.ok(customerInquiryResponse);
    }

    @PostMapping("/fundTransfer")
    public ResponseEntity<FundTransferResponse> fundTransfer(@RequestBody FundTransferRequest fundTransferRequest) {
        LOGGER.info("Fund Transfer Request");
        LOGGER.info("Source Card Number: {}", fundTransferRequest.getSourceCardNumber());
        LOGGER.info("Destination Card Number: {}", fundTransferRequest.getDestinationCardNumber());

        FundTransferResponse fundTransferResponse = new FundTransferResponse();
        fundTransferResponse.setResponseCode("Successful");
        return ResponseEntity.ok(fundTransferResponse);
    }

}
