/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.Objects;

/**
 *
 * @author khrisannibrown
 */
public class Patient extends Person {
    private int patientID;
    private String dateOfBirth;

    public Patient( String firstName, String lastName,int pathientID, String dateOfBirth) {
        super(firstName, lastName);
        this.patientID = pathientID;
        this.dateOfBirth = dateOfBirth;
    }
    
  
    public Patient(String firstName, String lastName, int patientID, String dateOfBirth, String legalGuardian)
    {
        
    }
   
    public Patient (Object obj)
    {
        
    }
    public Patient ()
    {
        
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientID=" + patientID + ", dateOfBirth=" + dateOfBirth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.patientID;
        hash = 97 * hash + Objects.hashCode(this.dateOfBirth);
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
        
        
        if (!Objects.equals(this.dateOfBirth, this.dateOfBirth)) {
            return false;
        }
        return true;
    }
    
    
}
