/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;


/**
 *
 * @author Parth
 */
public class AccountBillRqst extends WorkReq {

    private double billTotal;
    private boolean isInsured;
    private boolean isClmStld;

    Patient patient;

    public double getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(double billingAmt) {
        this.billTotal = billingAmt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setIsInsured(boolean hasIns) {
        this.isInsured = hasIns;
    }

    public boolean isClmStld() {
        return isClmStld;
    }

    public void setIsClmStld(boolean isInsClmSettled) {
        this.isClmStld = isInsClmSettled;
    }

    @Override
    public String toString() {
        return String.valueOf(billTotal);
    }

}
