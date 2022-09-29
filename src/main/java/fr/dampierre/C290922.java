package fr.dampierre;

import java.util.Scanner;

public class C290922 {
    static void println(String chaine) {
        System.out.println(chaine);
    }

    public static void main(String[] args) {
        int salaire = 480;
        int quotaVentes = 10;
        int prime = 250;

        // Methode créée
        println("Combien de ventes ?");

        Scanner clavier = new Scanner(System.in);
        int ventes = clavier.nextInt();
        clavier.close();

        if (ventes >= 10) { // Demandé Supérieur, mais remplir le quota est sûrement aussi l'atteindre
            println("Félicitations ! Vous avez rempli le quota.");
            salaire += prime;

        } else if (ventes < 0) {
            println("Wow, des ventes négatives !");

        } else {
            int ventesManquantes = quotaVentes - ventes;
            println("Il vous manque " + ventesManquantes + " ventes pour atteindre le quota.");
        }
    }
}
