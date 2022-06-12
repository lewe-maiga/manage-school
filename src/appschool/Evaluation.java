package appschool;


import java.util.*;

/**
 * 
 */
public class Evaluation {

    
    public Evaluation() {
    }

    public double getNote() {
        return this.Note;
    }

    public void setNote(double Note) {
        this.Note = Note;
    }

    
    public String toString() {
        return "Evaluation{" + "Note=" + this.Note + '}';
    }

    
    private double Note;

}