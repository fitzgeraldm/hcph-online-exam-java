package ph.homecredit.online.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ph.homecredit.online.exam.dto.LoanRequest;
import ph.homecredit.online.exam.dto.LoanResponse;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
@Slf4j
@Service
public class V1LoanServiceImpl implements LoanService {

  //TODO You may modify this method according to the requirements
  public LoanResponse applyLoan(LoanRequest request) {

    log.info("Request: {}", request);

    return LoanResponse.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .gender(request.getGender())
        .birthDate(request.getBirthDate().toString())
        .email(request.getEmail())
        .productType(request.getProductType())
        .amount(request.getAmount())
        .build();
  }
}
