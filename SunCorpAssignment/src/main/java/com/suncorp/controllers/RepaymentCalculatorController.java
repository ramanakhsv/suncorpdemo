package com.suncorp.controllers;

import com.suncorp.dto.LoanDTO;
import com.suncorp.model.Loan;
import com.suncorp.service.RepaymentCalculatorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RepaymentCalculator Rest Controller, which is the starting point of Service.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/loan")
public class RepaymentCalculatorController {

    /**
     * Service for RepaymentCalculator.
     */
    @Autowired
    private RepaymentCalculatorService repaymentCalculatorService;

    /**
     * This method calculates the loan repayment details.
     *
     * @param loan - loan model request object, which will have user input details
     * @return loanDTO - loan DTO response object,
     *                   which will return loan repayment calculated details.
     */
    @ApiOperation(value = "Calculates loan repayment details", notes = "Calculates loan repayment details")
    @RequestMapping(value = "/calculateRepayment", method = RequestMethod.POST, produces = {"application/json"})
    public ResponseEntity<?> calculateRepayment(@RequestBody Loan loan) {

        LoanDTO loanDTO = null;
        try {
            /**
             * Executes service method to retrieve loan repayment details.
             */
            loanDTO = repaymentCalculatorService.calculateRepayment(loan);
        } catch (Exception exception) {
            //catch exception;
        }
        return new ResponseEntity<LoanDTO>(loanDTO, HttpStatus.OK);
    }
}
