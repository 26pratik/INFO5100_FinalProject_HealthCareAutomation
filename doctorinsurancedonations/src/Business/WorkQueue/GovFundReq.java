/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Parth
 */
public class GovFundReq extends WorkReq {

    private String loc;
    private int population;
    private double amountRequested;

    public GovFundReq(String location, int pop, double requestAmount) {
        this.loc = location;
        this.population = pop;
        this.amountRequested = requestAmount;

    }

    @Override
    public String toString() {
        return loc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String location) {
        this.loc = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int pop) {
        this.population = pop;
    }

    public double getAmountRequested() {
        return amountRequested;
    }

    public void setAmountRequested(double reqAmt) {
        this.amountRequested = reqAmt;
    }

}
