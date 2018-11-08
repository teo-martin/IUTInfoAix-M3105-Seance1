package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employe {
    protected int num_emp;
    protected String num_secu;
    protected String nom_emp;
    protected String prenom_emp;
    protected int echelon;
    protected LocalDate date_naiss;
    protected LocalDate date_embauche;
    protected double base;
    protected double nbHeure;

    public Employe(int num_emp, String num_secu, String nom_emp, String prenom_emp, int echelon, LocalDate date_naiss,
                   LocalDate date_embauche, double base, double nbHeure) {
        this.num_emp = num_emp;
        this.num_secu = num_secu;
        this.nom_emp = nom_emp;
        this.prenom_emp = prenom_emp;
        this.echelon = echelon;
        this.date_naiss = date_naiss;
        this.date_embauche = date_embauche;
        this.base = base;
        this.nbHeure = nbHeure;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "num_emp=" + num_emp +
                ", num_secu='" + num_secu + '\'' +
                ", nom_emp='" + nom_emp + '\'' +
                ", prenom_emp='" + prenom_emp + '\'' +
                ", echelon=" + echelon +
                ", date_naiss=" + date_naiss +
                ", date_embauche=" + date_embauche +
                ", base =" + base +
                ", nbHeure =" + nbHeure +
                ", ancienneté=" + calcAnciennete() +
                ", salairebrut=" + calcSalBrut() +
                "salairenet=" + calcSalNet() +
                '}';
    }

    public double calcSalBrut()
    {
        return base*nbHeure;
    }

    public double calcSalNet()
    {
        return 0.8 * calcSalBrut();
    }

    public long calcAnciennete()
    {
        return ChronoUnit.MONTHS.between(this.date_embauche, LocalDate.now());
    }

    public int getNum_emp() {
        return num_emp;
    }

    public void setNum_emp(int num_emp) {
        this.num_emp = num_emp;
    }

    public String getNum_secu() {
        return num_secu;
    }

    public void setNum_secu(String num_secu) {
        this.num_secu = num_secu;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public String getPrenom_emp() {
        return prenom_emp;
    }

    public void setPrenom_emp(String prenom_emp) {
        this.prenom_emp = prenom_emp;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public LocalDate getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(LocalDate date_naiss) {
        this.date_naiss = date_naiss;
    }

    public LocalDate getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(LocalDate date_embauche) {
        this.date_embauche = date_embauche;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(double nbHeure) {
        this.nbHeure = nbHeure;
    }
}
