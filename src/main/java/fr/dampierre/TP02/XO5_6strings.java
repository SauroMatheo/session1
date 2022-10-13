package fr.dampierre.TP02;

import java.util.Scanner;

public class XO5_6strings {
    // Pratique
    static void println(String toPrintLn) {
        System.out.println(toPrintLn);
    }

    // Pour l'exercice 5
    static boolean capitale(String capstr) {
        Character chr = capstr.charAt(0);
        return Character.isUpperCase(chr);
    }

    // Pour l'exercice 6
    static int nbLettres(String str) {
        char[] chars = str.toCharArray();
        int lettres = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                lettres++;
            }
        }

        return lettres;
    }

    // Main
    public static void main(String[] args) {
        // Exercice 5
        println("Entrez un mot/string: ");
        Scanner clavier = new Scanner(System.in);
        String chaine = clavier.nextLine();
        clavier.close();

        if (capitale(chaine)) {
            println("La chaine est capitalisée.");
        } else {
            println("La chaine n'est pas capitalisée.");
        }

        // Exercice 6
        println("La chaine contient " + nbLettres(chaine) + " lettres. (De " + chaine.length() + " charactères)");
    }
}
