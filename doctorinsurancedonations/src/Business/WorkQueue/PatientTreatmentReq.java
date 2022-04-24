 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.SystemUserAccount.SystemUsers;

/**
 *
 * @author Parth
 */
public class PatientTreatmentReq extends WorkReq {

    private String registrationDate;
    private String visitReason;
    private Patient patient;
    private String typeOfLabTest;
    private String resultFromLab;
    private SystemUsers labAssitantEmployee;
    private String msgFromLabTest;
    private String drNote;
    private double totalBill;
    private SystemUsers drAssignd;
    private int bloodUnits;
    private String msgFromBloodBank;
    private SystemUsers bloodBankManagement;

    public SystemUsers getBloodBankManagement() {
        return bloodBankManagement;
    }

    public void setBloodBankManagement(SystemUsers bloodBankManagement) {
        this.bloodBankManagement = bloodBankManagement;
    }

    public int getBloodUnits() {
        return bloodUnits;
    }

    public void setBloodUnits(int bloodUnits) {
        this.bloodUnits = bloodUnits;
    }

    public String getMsgFromBloodBank() {
        return msgFromBloodBank;
    }

    public void setMsgFromBloodBank(String msgFromBloodBank) {
        this.msgFromBloodBank = msgFromBloodBank;
    }

    public PatientTreatmentReq(String Date, String reasonForVisit, Patient patient) {
        this.registrationDate = Date;
        this.visitReason = reasonForVisit;
        this.patient = patient;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String Date) {
        this.registrationDate = Date;
    }

    public String getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTypeOfLabTest() {
        return typeOfLabTest;
    }

    public void setTypeOfLabTest(String typeOfLabTest) {
        this.typeOfLabTest = typeOfLabTest;
    }

    public String getResultFromLab() {
        return resultFromLab;
    }

    public void setResultFromLab(String resultFromLab) {
        this.resultFromLab = resultFromLab;
    }

    public SystemUsers getLabAssitantEmployee() {
        return labAssitantEmployee;
    }

    public void setLabAssitantEmployee(SystemUsers labAssitantEmployee) {
        this.labAssitantEmployee = labAssitantEmployee;
    }

    public String getMsgFromLabTest() {
        return msgFromLabTest;
    }

    public void setMsgFromLabTest(String msgFromLabTest) {
        this.msgFromLabTest = msgFromLabTest;
    }

    public String getDrNote() {
        return drNote;
    }

    public void setDrNote(String drNote) {
        this.drNote = drNote;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public SystemUsers getDrAssignd() {
        return drAssignd;
    }

    public void setDrAssignd(SystemUsers drAssignd) {
        this.drAssignd = drAssignd;
    }

    @Override
    public String toString() {
        return visitReason;
    }

}
