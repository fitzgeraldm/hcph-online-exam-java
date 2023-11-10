package ph.homecredit.online.exam.service;

import ph.homecredit.online.exam.dto.LoanRequest;
import ph.homecredit.online.exam.dto.LoanResponse;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
public interface LoanService {

  LoanResponse applyLoan(LoanRequest request);
}
