package appschool;


import java.util.*;

/**
 * 
 */
public class Professeur extends Employe {

    /**
     * Default constructor
     */
    public Professeur() {
    }

    /**
     * 
     */
    private String Immatriculation;

    /**
     * 
     */
    private String Specialite;

    @Override
    public String toString() {
        return "Professeur{" + "Num_imm = " + this.Immatriculation + ", Specialite = " + this.Specialite + '}';
    }

    public String getNum_imm() {
        return this.Immatriculation;
    }

    public void setNum_imm(String immatriculation) {
        this.Immatriculation = immatriculation;
    }

    public String getSpecialite() {
        return this.Specialite;
    }

    public void setSpecialite(String Specialite) {
        this.Specialite = Specialite;
    }



}