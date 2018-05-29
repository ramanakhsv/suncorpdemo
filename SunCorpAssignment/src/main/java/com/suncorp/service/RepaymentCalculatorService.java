package com.suncorp.service;

import com.suncorp.dto.LoanDTO;
import com.suncorp.model.Loan;
import org.springframework.stereotype.Repository;

/**
 * Interface for Repayment Calculator Service
 */
public interface RepaymentCalculatorService {

    /**
     * This method is used to calculate the Repayment of Loan.
     * @param loan - request object
     * @return LoanDTO - response object
     * @throws Exception - if any
     */
    public LoanDTO calculateRepayment(Loan loan) throws Exception;
}
