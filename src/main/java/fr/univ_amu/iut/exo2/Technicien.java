package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Technicien extends Employe {

    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Technicien(int num_emp, String num_secu, String nom_emp, String prenom_emp, int echelon, LocalDate date_naiss
            , LocalDate date_embauche, double base, double nbHeure, int nbUnitesProduites, double tauxCommissionUnite) {
        super(num_emp, num_secu, nom_emp, prenom_emp, echelon, date_naiss, date_embauche, base, nbHeure);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    @Override
    public double calcSalBrut()
    {
        return base*nbHeure+nbUnitesProduites*tauxCommissionUnite+100;
    }

    @Override
    public String toString() {
        return "Technicien{" +
                "num_emp=" + num_emp +
                ", num_secu='" + num_secu + '\'' +
                ", nom_emp='" + nom_emp + '\'' +
                ", prenom_emp='" + prenom_emp + '\'' +
                ", echelon=" + echelon +
                ", date_naiss=" + date_naiss +
                ", date_embauche=" + date_embauche +
                ", salaire_brut=" + calcSalBrut() +
                ", type = Technicien" +
                '}';
    }

    public void fabriquerProduit()
    {
        System.out.println("Je fabrique un produit");
    }
}
