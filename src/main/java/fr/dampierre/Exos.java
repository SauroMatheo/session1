package fr.dampierre;

import java.util.Scanner;

public class Exos {

    public static void main(String[] args) {
        System.out.println("Bonjour");

        // Heure actuelle
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez les heures :");
        int heures = Integer.parseInt(scan.nextLine());

        System.out.println("Entrez les minutes :");
        int minutes = Integer.parseInt(scan.nextLine());

        System.out.println("Entrez les secondes :");
        int secondes = Integer.parseInt(scan.nextLine());

        scan.close();

        int secondesTotales = ((heures * 60 + minutes) * 60 + secondes);
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il s'est écoulé " + secondesTotales + " secondes depuis minuit.");

        int heuresExo = 15, minutesExo = 27, secondesExo = 12;
        int secondesExoTotales = (heuresExo * 60 + minutesExo) * 60 + secondesExo;
        System.out.println(secondesExoTotales);
        System.out.println(24 * 3600);

        float pourcentJour = (secondesExoTotales - secondesTotales) * 100 / (24 * 3600);
        System.out.println("L'exercice a prit " + pourcentJour + "% de la journée. Bravo.");
    }

}