package maping;
// Generated 23/06/2023, 12:39:52 p. m. by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Veterinary generated by hbm2java
 */
public class Veterinary  implements java.io.Serializable {


     private String vetCode;
     private String vetName;
     private String vetPhone;
     private String vetAddres;
     private String vetPacientType;
     private Set doctors = new HashSet(0);
     private Set pethospitals = new HashSet(0);

    public Veterinary() {
    }

	
    public Veterinary(String vetCode, String vetName, String vetPhone, String vetAddres, String vetPacientType) {
        this.vetCode = vetCode;
        this.vetName = vetName;
        this.vetPhone = vetPhone;
        this.vetAddres = vetAddres;
        this.vetPacientType = vetPacientType;
    }
    public Veterinary(String vetCode, String vetName, String vetPhone, String vetAddres, String vetPacientType, Set doctors, Set pethospitals) {
       this.vetCode = vetCode;
       this.vetName = vetName;
       this.vetPhone = vetPhone;
       this.vetAddres = vetAddres;
       this.vetPacientType = vetPacientType;
       this.doctors = doctors;
       this.pethospitals = pethospitals;
    }
   
    public String getVetCode() {
        return this.vetCode;
    }
    
    public void setVetCode(String vetCode) {
        this.vetCode = vetCode;
    }
    public String getVetName() {
        return this.vetName;
    }
    
    public void setVetName(String vetName) {
        this.vetName = vetName;
    }
    public String getVetPhone() {
        return this.vetPhone;
    }
    
    public void setVetPhone(String vetPhone) {
        this.vetPhone = vetPhone;
    }
    public String getVetAddres() {
        return this.vetAddres;
    }
    
    public void setVetAddres(String vetAddres) {
        this.vetAddres = vetAddres;
    }
    public String getVetPacientType() {
        return this.vetPacientType;
    }
    
    public void setVetPacientType(String vetPacientType) {
        this.vetPacientType = vetPacientType;
    }
    public Set getDoctors() {
        return this.doctors;
    }
    
    public void setDoctors(Set doctors) {
        this.doctors = doctors;
    }
    public Set getPethospitals() {
        return this.pethospitals;
    }
    
    public void setPethospitals(Set pethospitals) {
        this.pethospitals = pethospitals;
    }




}


