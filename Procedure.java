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
public class Procedure {
    private String code;
    private String description;
    private double charge;
    private boolean inPatient;
    
    public Procedure(String code, String description, double charge, boolean inPatient){
        this.code = code;
        this.description = description;
        this.charge = charge;
        this.inPatient = inPatient;
    }
    
    public String getCode(){
        return code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getdescription(){
        return description;
    }
    
    public void setdescription(String description){
        this.description = description;
    }
    
    public double getCharge(){
        return charge;
    }
    
    public void setCharge (double charge){
        this.charge = charge;
    }
    
   
    public boolean getInPatient (){
        return inPatient;
    }
    
    public void setInPatient (boolean inPatient){
        this.inPatient = inPatient;
    }

    @Override
    public String toString() {
        return "Procedure{" + "code=" + code + ", description=" + description + ", charge=" + charge + ", inPatient=" + inPatient + '}';
    }
    
}
