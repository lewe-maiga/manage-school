package appschool;


import java.util.*;

/**
 * 
 */
public class Prof_Resp extends Professeur {

    /**
     * Default constructor
     */
    public Prof_Resp() {
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Prof_Resp{" + "departement=" + departement + '}';
    }

    
    private String departement;

}