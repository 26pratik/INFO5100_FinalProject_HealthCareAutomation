

package Business.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parth
 */
public class PatientDirectory {
    
    private List<Patient> patients = new ArrayList<>();//List of Patients

    //Getters and Setters
    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
}
