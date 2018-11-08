package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args) {
        Employe yann = new Employe(0,
                "115145",
                "FORNER",
                "YANN",
                1,
                LocalDate.of(1999, Month.OCTOBER, 30),
                LocalDate.of(2020, Month.AUGUST, 25),
                1000,
                30
        );

        Employe tristan = new Employe(1,
                "11545759",
                "LAROUBINE",
                "TRISTAN",
                1,
                LocalDate.of(1999, Month.NOVEMBER, 11),
                LocalDate.of(2020, Month.FEBRUARY, 15),
                1000,
                35
        );

        Entreprise maBoiteInfo = new Entreprise("Le Slip Français");

        maBoiteInfo.embaucher(yann);
        maBoiteInfo.embaucher(tristan);
        maBoiteInfo.toString();
    }
}