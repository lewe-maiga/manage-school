package appschool;

import java.util.*;

/**
 * 
 */
public class ControleContinu extends Evaluation {

   
    public String toString() {
        return "ControleContinu{" + "pourcentageControle=" + this.pourcentageControle + '}';
    }

    public int getPourcentageControle() {
        return this.pourcentageControle;
    }

    public void setPourcentageControle(int pourcentageControle) {
        this.pourcentageControle = pourcentageControle;
    }
    public ControleContinu() {
    }

    private int pourcentageControle;

}