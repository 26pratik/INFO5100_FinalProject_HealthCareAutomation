/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Networks;

import Business.Enterprise.EntDirectory;

/**
 *
 * @author Pratik
 * This class is used to store and retrieve the networks
 */
public class Networks {
    private String networkName;
    private EntDirectory entDir;
    
    public Networks(){
        entDir=new EntDirectory();
    }
    public String getNetwrkName() {
        return networkName;
    }

    public void setNetwrkName(String netwrkNm) {
        this.networkName = netwrkNm;
    }

    public EntDirectory getEntDir() {
        return entDir;
    }
    
    @Override
    public String toString(){
        return networkName;
    }
    
}
