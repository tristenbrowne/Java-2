/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author khrisannibrown
 */
public class UnderagePatient extends Patient{
    private String legalGuardian;

    public UnderagePatient( String firstName, String lastName,int pathientID, String dateOfBirth,String legalGuardian) {
        super( firstName, lastName, pathientID, dateOfBirth);
        this.legalGuardian = legalGuardian;
    }

  
    public UnderagePatient (Object obj)
    {
        
    }
    public UnderagePatient ()
    {
        
    }

    public String getLegalGuardian() {
        return legalGuardian;
    }

    public void setLegalGuardian(String legalGuardian) {
        this.legalGuardian = legalGuardian;
    }
    
    
}
