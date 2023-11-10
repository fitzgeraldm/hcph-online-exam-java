package ph.homecredit.online.exam.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ph.homecredit.online.exam.dto.LoanRequest;
import ph.homecredit.online.exam.dto.LoanResponse;
import ph.homecredit.online.exam.service.LoanService;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/loan")
public class V1LoanApplicationControllerImpl implements LoanApplicationController {

  private final LoanService loanService;

  @PostMapping
  @Override
  public ResponseEntity<LoanResponse> applyLoan(@RequestBody LoanRequest request) {
    return ResponseEntity.ok(loanService.applyLoan(request));
  }
}
