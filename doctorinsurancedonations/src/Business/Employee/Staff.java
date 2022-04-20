/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Parth
 */
public class Staff {
    
    private String empName;
    private int empId;
    private static int count = 1;

    public Staff() {
        empId = count;
        count++;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName;
    }
    
    
}
