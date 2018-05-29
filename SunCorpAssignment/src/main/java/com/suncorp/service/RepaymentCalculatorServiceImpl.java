package com.suncorp.service;

import com.suncorp.dto.LoanDTO;
import com.suncorp.model.Loan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * This class implements RepaymentCalculator Interface
 */
@Service
public class RepaymentCalculatorServiceImpl implements RepaymentCalculatorService {

    public static final Logger LOGGER = LoggerFactory.getLogger(RepaymentCalculatorServiceImpl.class.getName());

    /**
     * This method is used to calculate the Repayment of Loan.
     * Note:- Hardcoded the business logic rather than connecting to actual DB for now.
     * @param loan - request object
     * @return LoanDTO - response object
     * @throws Exception - if any
     */
    @Override
    public LoanDTO calculateRepayment(Loan loan) throws Exception {

        LOGGER.info("INSIDE RepaymentCalculatorServiceImpl CLASS calculateRepayment METHOD ");

        LoanDTO loanDTO = new LoanDTO();
        loanDTO.setLoanAmount(loan.getLoanAmount());
        loanDTO.setLoanPurpose(loan.getLoanPurpose());
        loanDTO.setLoanPeriod(loan.getLoanPeriod());
        loanDTO.setLoanInterestRate(loan.getLoanInterestRate());
        loanDTO.setLoanComparisionRate(6.59);
        loanDTO.setEstablishmentFee(175);
        loanDTO.setGovtCharges(6.80);
        loanDTO.setServiceFee(5);
        loanDTO.setTotalAmountBorrowed(loan.getLoanAmount()+loanDTO.getEstablishmentFee()+loanDTO.getGovtCharges());
        loanDTO.setEmi(173.69);

        LOGGER.info("EXIT RepaymentCalculatorServiceImpl CLASS calculateRepayment METHOD ");

        return loanDTO;
    }
}
