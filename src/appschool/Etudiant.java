package appschool;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * 
 */
public class Etudiant extends Personne {

    /**
     * Default constructor
     */
    public Etudiant() {
    }

    public int getCNE() {
        return this.CNE;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "CNE=" + this.CNE + ", Niveau=" + this.Niveau + ", Annee_entr=" + this.Annee_entr + '}';
    }

    public void setCNE(int CNE) {
        this.CNE = CNE;
    }

    public int getNiveau() {
        return this.Niveau;
    }

    public void setNiveau(int Niveau) {
        this.Niveau = Niveau;
    }

    public int getAnnee_entr() {
        return this.Annee_entr;
    }

    public void setAnnee_entr(int Annee_entr) {
        this.Annee_entr = Annee_entr;
    }

    private int CNE;
    private int Niveau;
    private int Annee_entr;

    
    public int authentification(int cne, String password) throws IOException {
        String name="", type="";
        try {
            Connection dbConnexion;
            PreparedStatement statement, statement2;
            ResultSet result, resultAdmin;
            statement =  BdConnection.bdConnection.prepareStatement("select * from personne\n" +
                    "inner join etudiant\n" +
                    "where etudiant.cne = ? and personne.password = ? and personne.idpersonne = etudiant.idetudiant");
            //argument requête
            statement.setInt(1, cne);
            statement.setString(2, password);
            result = statement.executeQuery();
            int compteur = 0;
            while(result.next()){
                name =  result.getString("prenom") + " " + result.getString("nom");
                type = result.getString("type");
                compteur += 1;
            }
            if(compteur == 0){ return 0;}
            else if (compteur == 1){
                LogFiles.log(name, type);
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
            
    }

    
}