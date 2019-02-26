/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.ArrayList;

/**
 *
 * @author khrisannibrown
 */
public class Clinic {
    
    private String name;
    
    ArrayList <Doctor> listOfDoctors = new ArrayList<>(); 
    ArrayList <Patient> listOfPatients = new ArrayList<>();
    ArrayList <Visit> listOfVisits = new ArrayList<>();

//    public Clinic(String name, ArrayList<Doctor> listOfDoctors, ArrayList<Patient> listOfPatients, ArrayList<Visit> listOfVisits) {
//        this.name = name;
//        this.listOfDoctors = listOfDoctors;
//        this.listOfPatients = listOfPatients;
//        this.listOfVisits = listOfVisits;
//    }
    public Clinic ( String obj, Object obj1, Object obj2, Object obj3)
    {
        name = obj;
        
    }

    @Override
    public String toString() {
        System.out.println(name);
       for( int i = 0; i<listOfDoctors.size(); i++)
       {
           System.out.println(listOfDoctors.get(i));
       }
       for( int i = 0; i<listOfPatients.size(); i++)
       {
           System.out.println(listOfPatients.get(i));
       } 
       for( int i = 0; i<listOfVisits.size(); i++)
       {
           System.out.println(listOfVisits.get(i));
       }
        return "end";
    }
   
    
  public void addPatient(Patient patient)
  {
      listOfPatients.add(patient);
  }
  public void addVisit (Visit visit)
  {
      listOfVisits.add(visit);
  }
  public void addDoctor(Doctor doctor)
  {
      listOfDoctors.add(doctor);
  }
  
}