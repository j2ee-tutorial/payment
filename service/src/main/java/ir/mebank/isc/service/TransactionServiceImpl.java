package ir.mebank.isc.service;

import ir.mebank.isc.api.TransactionService;
import ir.mebank.isc.dto.CustomerInquiry;
import ir.mebank.isc.repository.CustomerInquiryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Autowired
    CustomerInquiryRepository repository;

    @Override
    public void customerInquiry(CustomerInquiry customerInquiryDto) {
        LOGGER.info("Customer Inquiry Service");

        // persist customer inquiry request with status : in progress
        ir.mebank.isc.to.CustomerInquiry customerInquiry = new ir.mebank.isc.to.CustomerInquiry();
        customerInquiry.setSourceCardNumber(customerInquiryDto.getSourceCardNumber());
        customerInquiry.setDestinationCardNumber(customerInquiryDto.getDestinationCardNumber());

        repository.save(customerInquiry);

        // call web services or do an other action to complete the request

        // update customer inquiry request to finished action
    }

    @Override
    public void fundTransfer() {

    }
}
