package appschool;


import java.util.*;

/**
 * 
 */
public class Filiere {

    @Override
    public String toString() {
        return "Filiere{" + "Ref_fil=" + this.Ref_fil + ", Nom_fil=" + this.Nom_fil + '}';
    }

    /**
     * Default constructor
     */
    public Filiere() {
    }

    public String getRef_fil() {
        return this.Ref_fil;
    }

    public void setRef_fil(String Ref_fil) {
        this.Ref_fil = Ref_fil;
    }

    public String getNom_fil() {
        return this.Nom_fil;
    }

    public void setNom_fil(String Nom_fil) {
        this.Nom_fil = Nom_fil;
    }

   
    private String Ref_fil;

    
    private String Nom_fil;


}