package fr.dampierre;

import java.util.Scanner;

public class TP02_4couleur {
    public static void main(String[] args) {

        System.out.println("Quelle couleur souhaitez-vous ? ");

        Scanner clavier = new Scanner(System.in);
        String reponse = clavier.next();
        clavier.close();

        if (reponse.equalsIgnoreCase("R")) {
            System.out.println("Vous avez choisi le rouge.");
        } else if (reponse.equalsIgnoreCase("V")) {
            System.out.println("Vous avez choisi le vert.");
        } else if (reponse.equalsIgnoreCase("B")) {
            System.out.println("Vous avez choisi le bleu.");
        } else {
            System.out.println("Connais pas.");
        }
    }
}
