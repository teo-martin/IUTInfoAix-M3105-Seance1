package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class EmployesOrdinaires extends Employe {
    public EmployesOrdinaires(int num_emp, String num_secu, String nom_emp, String prenom_emp, int echelon, LocalDate date_naiss, LocalDate date_embauche, double base, double nbHeure) {
        super(num_emp, num_secu, nom_emp, prenom_emp, echelon, date_naiss, date_embauche, base, nbHeure);
    }

    @Override
    public double calcSalBrut()
    {
        return base*nbHeure+echelon*100+100;
    }

    @Override
    public String toString() {
        return "EmployesOrdinaires{" +
                "num_emp=" + num_emp +
                ", num_secu='" + num_secu + '\'' +
                ", nom_emp='" + nom_emp + '\'' +
                ", prenom_emp='" + prenom_emp + '\'' +
                ", echelon=" + echelon +
                ", date_naiss=" + date_naiss +
                ", date_embauche=" + date_embauche +
                ", salaire_brut=" + calcSalBrut()+
                ", type = EmployesOrdianaires" +
                '}';
    }

    public void effectuerTacheOrdinaire()
    {
        System.out.println("J'effectue une tâche ordinaire");
    }
}
