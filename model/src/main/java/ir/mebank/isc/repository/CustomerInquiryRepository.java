package ir.mebank.isc.repository;

import ir.mebank.isc.to.CustomerInquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerInquiryRepository extends JpaRepository<CustomerInquiry, Long> {
    List<CustomerInquiry> findBySourceCardNumberAndDestinationCardNumber(String sourceCardNumber, String destinationCardNumber);
}
