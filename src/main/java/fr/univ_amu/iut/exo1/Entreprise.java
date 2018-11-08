package fr.univ_amu.iut.exo1;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private String nom_ent;
    private List<Employe> liste_emp = new ArrayList<>();

    public Entreprise(String nom_ent) {
        this.nom_ent = nom_ent;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nom_ent='" + nom_ent + '\'' +
                ", liste_emp=" + liste_emp +
                '}';
    }

    public void embaucher (Employe employe)
    {
        this.liste_emp.add(employe);
    }

    public void licensier (Employe employe)
    {

        this.liste_emp.remove(employe);
    }

    public String getNom_ent() {
        return nom_ent;
    }

    public void setNom_ent(String nom_ent) {
        this.nom_ent = nom_ent;
    }

    public List<Employe> getListe_emp() {
        return liste_emp;
    }

    public void setListe_emp(List<Employe> liste_emp) {
        this.liste_emp = liste_emp;
    }


}
