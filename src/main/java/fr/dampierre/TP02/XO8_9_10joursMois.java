package fr.dampierre.TP02;

public class XO8_9_10joursMois {
    static boolean estBissextile(int annee) {
        return annee % 4 == 0;
    }

    static int nbJoursDuMois(int nbMois, int annee) {
        int nbJours;

        if (nbMois == 2) {
            if (estBissextile(annee)) {
                nbJours = 29;
            } else {
                nbJours = 28;
            }
        } else {
            nbJours = 30 + nbMois % 2;
        }

        return nbJours;
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
