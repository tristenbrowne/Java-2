/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author Chris
 */
public class Specialist extends Doctor {
    private String specialty;
    private String trainingPrograms;

    public Specialist(String firstName, String lastName, int doctorID, String medSchool, int yearsOfExperience, String specialty, Object obj) {
        super(firstName, lastName, doctorID, medSchool, yearsOfExperience);
        this.specialty = specialty;
        this.trainingPrograms = trainingPrograms;
    }

    

    public Specialist(String specialty, String trainingPrograms, Object obj) {
        super(obj);
        this.specialty = specialty;
        this.trainingPrograms = trainingPrograms;
    }
    
    public Specialist(String specialty, String trainingPrograms) {
        this.specialty = specialty;
        this.trainingPrograms = trainingPrograms;
    }
    
    public Specialist( )
    {
        
    }
   
    
    public Specialist(String firstName, String lastName, String medSchool, String speciality, String trainingPrograms, int doctorID, int yearsOfExperience)
    {
    
    }
    

    
    public Specialist (Object obj)
    {
        
    }
     
    
    
    public String getspecialty(){
        return specialty;
    }
    
    public void setspeciality(int doctorID){
        this.specialty = specialty;
    }
    
    public String gettrainingPrograms(){
        return trainingPrograms;
    }
    
    public void settrainingProgams(String trainingPrograms){
        this.trainingPrograms = trainingPrograms;
    }
}
