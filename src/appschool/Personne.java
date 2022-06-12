package appschool;


import java.util.*;


public  class Personne {

    private String CIN;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private int Tel;
    private String Email; 
    private String Password;
    private Date dateNaissance;
    private String Type;
    // 
    public Personne(String CIN, String Nom, String Prenom, String Adresse, int Tel, String Email, String PWD, String Type) {
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.Tel = Tel;
        this.Email = Email;
        this.Password = PWD;
       
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    public Personne() {
    }

    @Override
    public String toString() {
        return "Personne{" + "CIN=" + this.CIN + ", Nom=" + this.Nom + ", Prenom=" + this.Prenom + ", Adresse=" + this.Adresse + ", Tel=" + this.Tel + ", Email=" + this.Email + ", PWD=" +this.Password + '}';
    }

    public String getCIN() {
        return this.CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return this.Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
   
    
    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    public void authentification(){};

}