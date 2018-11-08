package fr.univ_amu.iut.exo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

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

    public void distribuerBonus(long bonus) {
        
        Comparator<Employe> employeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe emp1, Employe emp2) {
                return emp1.date_embauche.compareTo(emp2.date_embauche);
            }
        };
        PriorityQueue<Employe> priorityQueue = new PriorityQueue<Employe>(liste_emp.size(), employeComparator);
        priorityQueue.addAll(liste_emp);

        while (bonus > 0 && !priorityQueue.isEmpty())
        {
            double prime = 0;
            Employe employe = priorityQueue.poll();
            if(bonus<10*employe.calcAnciennete())
            {
                prime = bonus;
                bonus = 0;
            } else
            {
                prime = employe.calcAnciennete()*10;
                bonus = bonus - 10*employe.calcAnciennete();
            }

            System.out.println(employe.getNom_emp() + "a obtenu un bonus de :" + prime);
            priorityQueue.remove(employe);

        }
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