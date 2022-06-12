package appschool;


import java.util.*;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */
    private int duree;
    private String Salle;
    private Date Date_cours;


    public Cours() {
    }

    @Override
    public String toString() {
        return "Cours{" + "Date_cours=" + this.Date_cours + ", duree=" + this.duree + ", Salle=" + this.Salle + '}';
    }

    /**
     * 
     */

    public Date getDate_cours() {
        return this.Date_cours;
    }

    public void setDate_cours(Date Date_cours) {
        this.Date_cours = Date_cours;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSalle() {
        return this.Salle;
    }

    public void setSalle(String Salle) {
        this.Salle = Salle;
    }

    
}