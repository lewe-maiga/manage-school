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
public class Employe extends Personne {

    
    public Employe() {
    }
    private int ID_emp;
    private double Salaire;
    private Date Date_emb;
    private String Grade;


    @Override
    public String toString() {
        return "Employe{" + "ID_emp=" + this.ID_emp + ", Salaire=" + this.Salaire + ", Date_emb=" + this.Date_emb + ", Grade=" + this.Grade + '}';
    }

    public int getID_emp() {
        return ID_emp;
    }

    public void setID_emp(int ID_emp) {
        this.ID_emp = ID_emp;
    }

    public double getSalaire() {
        return Salaire;
    }

    public void setSalaire(double Salaire) {
        this.Salaire = Salaire;
    }

    public Date getDate_emb() {
        return Date_emb;
    }

    public void setDate_emb(Date Date_emb) {
        this.Date_emb = Date_emb;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    
    public int authentification(String login, String password) throws IOException {
        Connection dbConnexion;
        PreparedStatement statement, statement2;
        ResultSet result, resultAdmin;
        
            
        try {
            //connection a la base de donnée 
            String name ="", type="", typeEmploye="";
            
            //requête 
            statement =  BdConnection.bdConnection.prepareStatement("select * from personne inner join employe where personne.email = ? and personne.password = ? and personne.idpersonne = employe.idemploye");
            //argument requête
            statement.setString(1, login);
            statement.setString(2, password);
            result = statement.executeQuery();
            int compteur = 0;
            while(result.next()){
                compteur += 1;
                name =  result.getString("prenom") + " " + result.getString("nom");
                type = result.getString("type");
                typeEmploye = result.getString("type_employe");
                
            }
            if(compteur == 0){
                System.out.println(compteur);
                return 0;
            }
            else if (compteur == 1){ 
                LogFiles.log(name, type);
                if(typeEmploye.equals("superadmin")){
                    return 2;
                }
                return 1;
            }               

        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}