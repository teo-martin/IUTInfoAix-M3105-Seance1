package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Vendeur extends Commercial {
    public Vendeur(int num_emp, String num_secu, String nom_emp, String prenom_emp, int echelon, LocalDate date_naiss, LocalDate date_embauche, double base, double nbHeure, double chiffeAffaire, double tauxCommission) {
        super(num_emp, num_secu, nom_emp, prenom_emp, echelon, date_naiss, date_embauche, base, nbHeure, chiffeAffaire, tauxCommission);
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
                ", type = Vendeur" +
                '}';
    }
}
