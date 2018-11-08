package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;
import fr.univ_amu.iut.exo1.Entreprise;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Representant yann = new Representant(0,
                "115145",
                "FORNER",
                "YANN",
                1,
                LocalDate.of(1999, Month.OCTOBER, 30),
                LocalDate.of(2020, Month.AUGUST, 25),
                1000,
                30,
                1005,
                0.1
        );

        Technicien tristan = new Technicien(1,
                "11545759",
                "LAROUBINE",
                "TRISTAN",
                1,
                LocalDate.of(1999, Month.NOVEMBER, 11),
                LocalDate.of(2020, Month.FEBRUARY, 15),
                1000,
                35,
                150,
                0.1
        );

        Entreprise maBoiteInfo = new Entreprise("Le Slip Français");

        maBoiteInfo.embaucher(yann);
        maBoiteInfo.embaucher(tristan);
        maBoiteInfo.toString();
    }
}