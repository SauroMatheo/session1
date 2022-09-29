package fr.dampierre;

import java.util.Scanner;

public class TP02_5capitale {
    static boolean capitale(String str) {
        Character chr = str.charAt(0);
        return Character.isUpperCase(chr);
    }

    public static void main(String[] args) {
        System.out.println("Entrez un mot/string: ");
        Scanner clavier = new Scanner(System.in);
        String str = clavier.next();
        clavier.close();

        if (capitale(str)) {
            System.out.println("Le mot est capitalisé.");
        } else {
            System.out.println("Le mot n'est pas capitalisé.");
        }
    }
}
