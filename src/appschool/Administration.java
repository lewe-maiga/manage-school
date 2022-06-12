package appschool;



import java.util.*;


public class Administration extends Employe {

    
    public Administration() {
    }

    
    private String Ref_admin;

    private String Responsabilite;

    public String toString() {
        return "Administration{" + "Ref_admin=" + this.Ref_admin + ", Responsabilite=" + this.Responsabilite + '}';
    }

    public String getRef_admin() {
        return this.Ref_admin;
    }

    public void setRef_admin(String Ref_admin) {
        this.Ref_admin = Ref_admin;
    }

    public String getResponsabilite() {
        return this.Responsabilite;
    }

    public void setResponsabilite(String Responsabilite) {
        this.Responsabilite = Responsabilite;
    }

}