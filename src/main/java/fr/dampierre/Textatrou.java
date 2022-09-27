package fr.dampierre;

import java.util.Scanner;

public class Textatrou {
    public static void main(String[] args) {
        System.out.println("Bonjour !");

        Scanner clavier = new Scanner(System.in);

        System.out.println("Quel est le nom du personnage ?");
        String personnage = clavier.next();
        System.out.println("Combien y a-t-il d'objets ? ");
        int nbObjet = clavier.nextInt();
        System.out.println("Quel est le nom de l'objet ?");
        String objet = clavier.next();
        System.out.println("Quel est l'adjectif ?");
        String adjectif = clavier.next();

        clavier.close();

        // Afficher le résultat
        System.out.println("Il était une fois un " + personnage + " qui avait " + nbObjet + " " + objet
                + ". Cela le rendait très " + adjectif + ".");
    }
}
