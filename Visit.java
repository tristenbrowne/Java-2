/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Tristen
 */
public class Visit {

private String visitDate; 
private Doctor attendingPhysician;   
private Patient patient; 
private ArrayList <Diagnosis> listOfDiagnosis = new ArrayList<>(); 
private ArrayList <Procedure> listofProcedures = new ArrayList<>();

    public Visit(Doctor attendingPhys, Patient patient, Object diag, Object proc, String date) {
        this.visitDate = date;
        this.attendingPhysician = attendingPhys;
        this.patient = patient;
        this.listOfDiagnosis = (ArrayList<Diagnosis>) diag;
        this.listofProcedures = (ArrayList<Procedure>) proc;
    }

    public Visit( Object doc1, Object doc2, Object diag1, Object list1, String date ){
       
        this.visitDate = date;
        
    }
    public Visit( Object obj){
        
    }
    

    public String getVisitDate() {
        return visitDate;
    }

    public Doctor getAttendingPhysician() {
        return attendingPhysician;
    }

    public Patient getPatient() {
        return patient;
    }

    public ArrayList<Diagnosis> getListOfDiagnosis() {
        return listOfDiagnosis;
    }

    public ArrayList<Procedure> getListofProcedures() {
        return listofProcedures;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public void setAttendingPhysician(Doctor attendingPhysician) {
        this.attendingPhysician = attendingPhysician;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setListOfDiagnoses(ArrayList<Diagnosis> listOfDiagnosis) {
        this.listOfDiagnosis = listOfDiagnosis;
    }

    public void setListOfProcedures(ArrayList<Procedure> listofProcedures) {
        this.listofProcedures = listofProcedures;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Visit other = (Visit) obj;
        if (!Objects.equals(this.visitDate, other.visitDate)) {
            return false;
        }
        if (!Objects.equals(this.attendingPhysician, other.attendingPhysician)) {
            return false;
        }
        if (!Objects.equals(this.patient, other.patient)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit{" + "visitDate=" + visitDate + ", attendingPhysician=" + attendingPhysician + ", patient=" + patient + ", listOfDiagnosis=" + listOfDiagnosis + ", listofProcedures=" + listofProcedures + '}';
    }

    
    
    
    
    
    /**
     * This copy method creates a new Visit object and initializes it with the same
     * data in the calling object.
     * @return reference to a new object; 
     */
    public Visit copy()
    {
        Visit copyObject = new Visit(this.attendingPhysician, this.patient,this.listOfDiagnosis, this.listofProcedures, this.visitDate); 
        
        return copyObject;                
    }
    
    
  


    
    
    
    
    
    
    
}
