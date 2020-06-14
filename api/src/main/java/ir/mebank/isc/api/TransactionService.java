package ir.mebank.isc.api;

import ir.mebank.isc.dto.CustomerInquiry;

public interface TransactionService {
    void customerInquiry(CustomerInquiry customerInquiry);

    void fundTransfer();
}
