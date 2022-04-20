/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Parth
 */
public class StaffDirectory {

    private ArrayList<Staff> empList;

    public StaffDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Staff> getEmpList() {
        return empList;
    }

    public Staff createEmployee(String name) {
        Staff employee = new Staff();
        employee.setEmpName(name);
        empList.add(employee);
        return employee;
    }
}
