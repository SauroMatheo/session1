package fr.dampierre.TP02;

import java.util.Scanner;

public class XO4couleur {
    static String couleur() {
        System.out.println("Quelle couleur souhaitez-vous ? ");

        Scanner clavier = new Scanner(System.in);
        String reponse = clavier.next();
        clavier.close();

        if (reponse.equalsIgnoreCase("R")) {
            return "rouge";
        }
        if (reponse.equalsIgnoreCase("V")) {
            return "vert";
        }
        if (reponse.equalsIgnoreCase("B")) {
            return "bleu";
        }

        return "connais pas";
    }

    public static void main(String[] args) {
        String choix = couleur();
        if (choix.equals("connais pas")) {
            System.out.println("Connais pas.");
        } else {
            System.out.println("Vous avez choisi le " + choix + ".");
        }
    }
}
