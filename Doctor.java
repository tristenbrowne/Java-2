/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.Objects;

/**
 *
 * @author Chris
 */
public class Doctor extends Person {
    private int doctorID;
    private String medSchool;
    private int yearsOfExperience;
    
    public Doctor (String firstName, String lastName, int doctorID,String medSchool,  int yearsofexperience) {
        super(firstName,lastName);
        this.doctorID = doctorID;
        this.yearsOfExperience = yearsofexperience;
        this.medSchool = medSchool;
    }
       public Doctor(String firstName, String lastName, int yearsOfExperience, String date)
    {
        this.yearsOfExperience = yearsOfExperience;
    }
    public Doctor(String firstName, String lastName, String medSchool, String speciality, String trainingPrograms, int doctorID, int yearsOfExperience)
    {
    
    }
    

    
    public Doctor (Object obj)
    {
        
    }
    public Doctor()
    {
        
    }
    
    public int getdoctorID(){
        return doctorID;
    }
    
    public void setDoctorID(int doctorID){
        this.doctorID = doctorID;
    }
    
    public int getyearsOfExperience(){
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getMedSchool() {
        return medSchool;
    }

    public void setMedSchool(String medSchool) {
        this.medSchool = medSchool;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.doctorID;
        hash = 29 * hash + Objects.hashCode(this.medSchool);
        hash = 29 * hash + this.yearsOfExperience;
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
        final Doctor other = (Doctor) obj;
        if (this.doctorID != other.doctorID) {
            return false;
        }
        if (this.yearsOfExperience != other.yearsOfExperience) {
            return false;
        }
        if (!Objects.equals(this.medSchool, other.medSchool)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doctor{" + "doctorID=" + doctorID + ", medSchool=" + medSchool + ", yearsOfExperience=" + yearsOfExperience + '}';
    }
    
    
    
}
