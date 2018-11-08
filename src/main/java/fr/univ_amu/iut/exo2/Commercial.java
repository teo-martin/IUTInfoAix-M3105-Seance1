package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Commercial extends Employe {

    protected double chiffeAffaire;
    protected double tauxCommission;

    public Commercial(int num_emp, String num_secu, String nom_emp, String prenom_emp, int echelon, LocalDate date_naiss, LocalDate date_embauche, double base, double nbHeure, double chiffeAffaire, double tauxCommission) {
        super(num_emp, num_secu, nom_emp, prenom_emp, echelon, date_naiss, date_embauche, base, nbHeure);
        this.chiffeAffaire = chiffeAffaire;
        this.tauxCommission = tauxCommission;
    }

    @Override
    public double calcSalBrut()
    {
        return base*nbHeure+chiffeAffaire*tauxCommission+100;
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "num_emp=" + num_emp +
                ", num_secu='" + num_secu + '\'' +
                ", nom_emp='" + nom_emp + '\'' +
                ", prenom_emp='" + prenom_emp + '\'' +
                ", echelon=" + echelon +
                ", date_naiss=" + date_naiss +
                ", date_embauche=" + date_embauche +
                ", salaire_brut=" + calcSalBrut()+
                ", type = Commercial" +
                '}';
    }

    public void negocierTransaction()
    {
        System.out.println("Je negocie une transaction");
    }

    public double getChiffeAffaire() {
        return chiffeAffaire;
    }

    public void setChiffeAffaire(double chiffeAffaire) {
        this.chiffeAffaire = chiffeAffaire;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }
}
