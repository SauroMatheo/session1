package fr.dampierre;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bonjour !");

        // Récupérer le nombre d'heures travaillées
        // int heuresTravaillees = 120;

        Scanner clavier = new Scanner(System.in);
        int heuresTravaillees = clavier.nextInt();

        // Récupérer le taux horaire
        // double tauxHoraire = 10.35;
        double tauxHoraire = clavier.nextDouble();

        clavier.close();

        // Multiplier le nombre d'heures par le taux Horaire
        double salaireBrut = heuresTravaillees * tauxHoraire;

        // Afficher le résultat
        System.out.println("Le Salaire brut est de : " + salaireBrut);
    }
}
