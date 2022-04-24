/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */
package Business.WorkQueue;

import java.util.ArrayList;

public class WorkQ {

    private ArrayList<WorkReq> wrkReqs;

    public WorkQ() {
        wrkReqs = new ArrayList();
    }

    public ArrayList<WorkReq> getWrkReqs() {
        return wrkReqs;
    }
}
