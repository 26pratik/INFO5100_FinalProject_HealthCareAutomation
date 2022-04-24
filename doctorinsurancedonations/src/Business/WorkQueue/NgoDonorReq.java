/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author Parth
 */
public class NgoDonorReq extends WorkReq{
    private String nameOfDonor;
    private String addressOfDonor;
    private int donation;
    
    public NgoDonorReq(String nameOfDonor, String addressOfDonor, int donation){
        this.nameOfDonor = nameOfDonor;
        this.addressOfDonor = addressOfDonor;
        this.donation = donation;
    }
    
    @Override
    public String toString() {
        return nameOfDonor;
    }
    
    public String getNameOfDonor() {
        return nameOfDonor;
    }

    public void setNameOfDonor(String nameOfDonor) {
        this.nameOfDonor = nameOfDonor;
    }

    public String getAddressOfDonor() {
        return addressOfDonor;
    }

    public void setAddressOfDonor(String addressOfDonor) {
        this.addressOfDonor = addressOfDonor;
    }

    public int getDonation() {
        return donation;
    }

    public void setDonation(int donation) {
        this.donation = donation;
    }

}

