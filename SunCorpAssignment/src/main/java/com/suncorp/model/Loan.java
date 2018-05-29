package com.suncorp.model;

import java.io.Serializable;

/**
 * Loan Model class.
 */
public class Loan implements Serializable {

    /**
     * What will user be using the loan for.  i.e, loan purpose.
     */
    private String loanPurpose;
    /**
     * How much would user like to borrow. i.e, loan amount.
     */
    private double loanAmount;
    /**
     * Over what period will user repay the loan. i.e, loan period.
     */
    private int loanPeriod;
    /**
     * Loan interest rate opted by user.
     */
    private double loanInterestRate;

    /**
     * Getter for loanPurpose field.
     * @return loanPurpose
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Setter for loanPurpose field.
     * @param loanPurpose - loan purpose
     */
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    /**
     * Getter for loanAmount field.
     * @return loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Setter for loanAmount field.
     * @param loanAmount - loan amount
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * Getter for loanPeriod field.
     * @return loanPeriod
     */
    public int getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * Setter for loanPeriod field.
     * @param loanPeriod - loan period
     */
    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    /**
     * Getter for loanInterestRate field.
     * @return loanInterestRate
     */
    public double getLoanInterestRate() {
        return loanInterestRate;
    }

    /**
     * Setter for loanInterestRate field.
     * @param loanInterestRate - loan interest rate
     */
    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }
}
