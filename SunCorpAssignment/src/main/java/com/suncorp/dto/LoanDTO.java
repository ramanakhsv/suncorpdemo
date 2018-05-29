package com.suncorp.dto;

import java.io.Serializable;

public class LoanDTO implements Serializable {

    /**
     * What will user be using the loan for.  i.e, loan purpose
     */
    private String loanPurpose;
    /**
     * How much would user like to borrow. i.e, loan amount
     */
    private double loanAmount;
    /**
     * Over what period will user repay the loan. i.e, loan period
     */
    private int loanPeriod;
    /**
     * Loan interest rate opted by user.
     */
    private double loanInterestRate;
    /**
     * EMI to be paid by user per month
     */
    private double emi;
    /**
     * Loan comparision Rate
     */
    private double loanComparisionRate;
    /**
     * Loan establishment fee
     */
    private double establishmentFee;
    /**
     * Government charges for the loan taken
     */
    private double govtCharges;
    /**
     * Service fee for the loan taken
     */
    private double serviceFee;
    /**
     * Total amount borrowed
     */
    private double totalAmountBorrowed;


    /**
     * Getter for loanPurpose field
     * @return loanPurpose
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Setter for loanPurpose field
     * @param loanPurpose
     */
    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    /**
     * Getter for loanAmount field
     * @return loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Setter for loanAmount field
     * @param loanAmount
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * Getter for loanPeriod field
     * @return loanPeriod
     */
    public int getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * Setter for loanPeriod field
     * @param loanPeriod
     */
    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    /**
     * Getter for loanInterestRate field
     * @return loanInterestRate
     */
    public double getLoanInterestRate() {
        return loanInterestRate;
    }

    /**
     * Setter for loanInterestRate field
     * @param loanInterestRate
     */
    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    /**
     * Getter for emi field
     * @return emi
     */
    public double getEmi() {
        return emi;
    }

    /**
     * Setter for emi field
     * @param emi
     */
    public void setEmi(double emi) {
        this.emi = emi;
    }

    /**
     * Getter for loanComparisionRate field
     * @return loanComparisionRate
     */
    public double getLoanComparisionRate() {
        return loanComparisionRate;
    }

    /**
     * Setter for loanComparisionRate field
     * @param loanComparisionRate
     */
    public void setLoanComparisionRate(double loanComparisionRate) {
        this.loanComparisionRate = loanComparisionRate;
    }

    /**
     * Getter for establishmentFee field
     * @return establishmentFee
     */
    public double getEstablishmentFee() {
        return establishmentFee;
    }

    /**
     * Setter for establishmentFee field
     * @param establishmentFee
     */
    public void setEstablishmentFee(double establishmentFee) {
        this.establishmentFee = establishmentFee;
    }

    /**
     * Getter for govtCharges field
     * @return govtCharges
     */
    public double getGovtCharges() {
        return govtCharges;
    }

    /**
     * Setter for govtCharges field
     * @param govtCharges
     */
    public void setGovtCharges(double govtCharges) {
        this.govtCharges = govtCharges;
    }

    /**
     * Getter for serviceFee field
     * @return serviceFee
     */
    public double getServiceFee() {
        return serviceFee;
    }

    /**
     * Setter for serviceFee field
     * @param serviceFee
     */
    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * Getter for totalAmountBorrowed field
     * @return totalAmountBorrowed
     */
    public double getTotalAmountBorrowed() {
        return totalAmountBorrowed;
    }

    /**
     * Setter for totalAmountBorrowed field
     * @param totalAmountBorrowed
     */
    public void setTotalAmountBorrowed(double totalAmountBorrowed) {
        this.totalAmountBorrowed = totalAmountBorrowed;
    }
}
