package appschool;


import java.util.*;

public class ControleFinal extends Evaluation {

    
    public ControleFinal() {
    }

   
    private int pourcentatageExamen;

    @Override
    public String toString() {
        return "ControleFinal{" + "pourcentatageExamen=" + this.pourcentatageExamen + '}';
    }

    public int getPourcentatageExamen() {
        return this.pourcentatageExamen;
    }

    public void setPourcentatageExamen(int pourcentatageExamen) {
        this.pourcentatageExamen = pourcentatageExamen;
    }

}