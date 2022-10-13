package fr.dampierre.TP02;

import java.time.YearMonth;

public class XO11joursMois2 {
    static boolean estBissextile(int annee) {
        YearMonth ym = YearMonth.of(annee, 1);
        return ym.isLeapYear();
    }

    static int nbJoursDuMois(int mois, int annee) {
        YearMonth ym = YearMonth.of(annee, mois);
        return ym.lengthOfMonth();
    }

    public static void main(String[] args) {
        System.out.println("L'année 2019 est bissextile: " + estBissextile(2019));
        System.out.println("L'année 2020 est bissextile: " + estBissextile(2020));

        System.out.println("Janvier 2020 a " + nbJoursDuMois(1, 2020) + " jours.");
        System.out.println("Février 2020 a " + nbJoursDuMois(2, 2020) + " jours.");
        System.out.println("Février 2022 a " + nbJoursDuMois(2, 2022) + " jours.");
        System.out.println("Avril 2022 a " + nbJoursDuMois(4, 2022) + " jours.");
    }
}
