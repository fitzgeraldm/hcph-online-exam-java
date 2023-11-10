package ph.homecredit.online.exam.controller;


import org.springframework.http.ResponseEntity;
import ph.homecredit.online.exam.dto.LoanRequest;
import ph.homecredit.online.exam.dto.LoanResponse;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
public interface LoanApplicationController {

  ResponseEntity<LoanResponse> applyLoan(LoanRequest request);


}
