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
public class Medical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // testing the Patient class       
        String msg;
        
        // testing the Patient class       
        System.out.println("*** Testing the Patient class ***");
        Patient patient1 = new Patient("John", "Doe", 1, "05/19/1978");
        Patient patient2 = new Patient(patient1);
        
        msg =  "Do patient1 and patient2 reference the same object? "; 
        msg += (patient1 == patient2);
        System.out.println(msg);
        
        msg = "Do they have the same data? ";
        msg += patient1.equals(patient2);
        System.out.println(msg);
        
        msg = "Do they generate the same hash code? "; 
        msg += patient1.hashCode()==patient2.hashCode();
        System.out.println(msg);
        
        patient2.setFirstName("Mary");
        patient2.setLastName("Smith");
        patient2.setPatientID(2);
        
        System.out.println("\nAfter changing the data in patient2...");
        msg = "Do they still have the same data? ";
        msg += patient1.equals(patient2);
        System.out.println(msg);
        
        msg = "Do they still generate the same hash code? "; 
        msg += ( patient1.hashCode() == patient2.hashCode() );
        System.out.println(msg);
        
        // create two other Patient objects
        Patient patient3 = new Patient("Mary", "Porter", 3, "05/12/1980");
        Patient patient4 = new Patient("John", "Smith", 4, "07/15/1985");
        
        
        // testing the UnderagePatient class
        System.out.println("\n*** Testing the UnderagePatient class ***");
        UnderagePatient underagePatient1 = new UnderagePatient("Alice", "Jones", 5, "04/22/2004", "Maureen Morales");
        UnderagePatient underagePatient2 = new UnderagePatient(underagePatient1);
        
        msg = "Are underagePatient1 and underagePatient2 equal? ";
        msg += underagePatient1.equals(underagePatient2);
        System.out.println(msg);
              
        underagePatient2.setFirstName("Robin");
        underagePatient2.setLastName("Rodriguez");
        
        System.out.println("\nAfter changing the data in underagePatient2...");
        msg = "Are underagePatient1 and underagePatient2 still equal? ";
        msg += underagePatient1.equals(underagePatient2);
        System.out.println(msg);
        
        msg = "Do they generate the same hashcode? ";
        msg += ( underagePatient1.hashCode() == underagePatient2.hashCode() );
        System.out.println(msg);
        
        underagePatient2.setPatientID(6);
        underagePatient2.setDateOfBirth("06/23/2002");
        underagePatient2.setLegalGuardian("Brenda Brown");
        
        
        // testing the Doctor class
        System.out.println("\n*** Testing the Doctor class ***");
        Doctor doctor1 = new Doctor("Elizabeth", "Portella", 1, "FIU Med School", 15);
        Doctor doctor2 = new Doctor(doctor1);
        
        msg = "Are doctor1 and doctor2 equal? " + doctor1.equals(doctor2);
        System.out.println(msg);
        
        doctor2.setYearsOfExperience(11);
        
        msg = "Are doctor1 and doctor2 still equal? " + doctor1.equals(doctor2);
        System.out.println(msg);
        
        doctor2.setFirstName("Mario");
        doctor2.setLastName("Moore");
        doctor2.setDoctorID(2);
        doctor2.setMedSchool("UM Med School");
        
        
        // testing the Specialist class
        System.out.println("\n*** Testing the Specialist class ***");
        ArrayList<String> attendedPrograms = new ArrayList<>();
        attendedPrograms.add("BLAH");
        attendedPrograms.add("AKES");
        attendedPrograms.add("CRZ");
        Specialist specialist1 = new Specialist("Marco", "Malone", 3, "FSU Med School", 10, "Allergy", attendedPrograms);
        
        attendedPrograms.remove(0);
        attendedPrograms.add("RFV");
        Specialist specialist2 = new Specialist("Susan", "Smith", 4, "FIU Med School", 7, "Dermatology", attendedPrograms);
        
        msg = "Are specialist1 and specialist2 equal? " + specialist1.equals(specialist2);
        System.out.println(msg);
        
        attendedPrograms.set(1, "blah");
        attendedPrograms.remove(2);
        msg = "Changes made to the attendedPrograms variable should not affect the data in the Specialist objects.";
        System.out.println(msg);
        
        msg = "Data in the attendedPrograms Arraylist:\n";
        for( String program : attendedPrograms)
            msg += program + "\n";
        System.out.println(msg);
        
        msg = "Data in the specialist2 object " + specialist2;
        System.out.println(msg);
        
        
        // testing the Diagnosis class
        System.out.println("\n*** Testing the Diagnosis class ***");
        Diagnosis diagnosis1 = new Diagnosis("276.51", "Dehydr");
        diagnosis1.setDescription("Dehydration");
        System.out.println(diagnosis1);
        
        Diagnosis diagnosis2 = new Diagnosis("465.9", "Upper Respiratory Infection");
        Diagnosis diagnosis3 = new Diagnosis("490.0", "Bronchitis");
        Diagnosis diagnosis4 = new Diagnosis("493.9", "Asthma");
        Diagnosis diagnosis5 = new Diagnosis("724.5", "Backache");
        Diagnosis diagnosis6 = new Diagnosis("780.6", "Fever");
        Diagnosis diagnosis7 = new Diagnosis("784.0", "Headache");
        Diagnosis diagnosis8 = new Diagnosis("789.00", "Abdominal Pain");
        Diagnosis diagnosis9 = new Diagnosis("995.3", "Allergic Reaction");
        
        
        // testing the Procedure class
        System.out.println("\n*** Testing the Procedure class ***");
        Procedure procedure1 = new Procedure("99203", "New Patient Office Visit.", 45.00, false);
        procedure1.setCharge(50.00);
        procedure1.setInPatient(true);
        System.out.println(procedure1);

        Procedure procedure2 = new Procedure("99385", "New Patient Physical Examination.", 125.00, true);
        Procedure procedure3 = new Procedure("99213", "Established Patient Office Visit.", 40.00, true);
        Procedure procedure4 = new Procedure("99396", "Established Patient Physical Examination.", 100.00, true);
        Procedure procedure5 = new Procedure("36415", "Collection, Venous Blood, Venipuncture.", 150, false);
        
        
        // testing the Visit class
        System.out.println("\n*** Testing the Visit class ***");
        ArrayList<Diagnosis> diagnosesList1 = new ArrayList<>();
        diagnosesList1.add(diagnosis1);
        diagnosesList1.add(diagnosis6);
        diagnosesList1.add(diagnosis7);
        
        ArrayList<Procedure> procedureList1 = new ArrayList<>();
        procedureList1.add(procedure1);
        procedureList1.add(procedure2);
        
        Visit visit1 = new Visit(specialist1, patient1, null, null, "01/15/2017");
        visit1.setListOfDiagnoses(diagnosesList1);
        visit1.setListOfProcedures(procedureList1);
        
        // this change to diagnosesList1 should not affect the list of diagnoses in visit1
        diagnosis9.setDescription("Blah");
        diagnosesList1.set(1, diagnosis9); 
        
        System.out.println(visit1);
        
        ArrayList<Diagnosis> diagnosesList2 = new ArrayList<>();
        diagnosesList2.add(diagnosis2);
        diagnosesList2.add(diagnosis3);
        diagnosesList2.add(diagnosis4);
        
        ArrayList<Procedure> procedureList2 = new ArrayList<>();
        procedureList2.add(procedure3);
        procedureList2.add(procedure4);
        
        Visit visit2 = new Visit(doctor1, patient2, diagnosesList2, procedureList2, "03/16/2016");
        
        // this change to procedureList2 should not affect the list of procedures in visit2
        procedureList2.add(procedure1);
        
        System.out.println(visit2);
        
        ArrayList<Diagnosis> diagnosisList3 = new ArrayList<>();
        diagnosisList3.add(diagnosis6);
        diagnosisList3.add(diagnosis7);
        diagnosis9.setDescription("Allergic Reaction");
        diagnosisList3.add(diagnosis9);
        
        Visit visit3 = new Visit(specialist2, underagePatient2, diagnosisList3, procedureList2, "03/16/2016");
               
        
        // testing the Clinic class
        System.out.println("\n*** Testing the Clinic class ***");
        Clinic clinic = new Clinic("My Test Clinic", null, null, null);
        
        clinic.addPatient(patient1);
        clinic.addPatient(patient2);
        clinic.addPatient(patient3);
        clinic.addPatient(patient4);
        clinic.addPatient(underagePatient1);
        clinic.addPatient(underagePatient2);
        
        clinic.addDoctor(doctor1);
        clinic.addDoctor(doctor2);
        clinic.addDoctor(specialist1);
        clinic.addDoctor(specialist2);
        
        clinic.addVisit(visit1);
        clinic.addVisit(visit2);
        clinic.addVisit(visit3);
        
        //the following changes should not affect the clinic's data
        doctor1.setFirstName("Blah");
        visit1.setVisitDate("1/1/1111");
        
        System.out.println(clinic);
        
            }
    
}
