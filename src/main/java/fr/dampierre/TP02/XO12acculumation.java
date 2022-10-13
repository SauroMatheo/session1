package fr.dampierre.TP02;

import java.util.Scanner;

public class XO12acculumation {
    static void sommePairsEtMax(Scanner clavier) {
        System.out.print("Combien d'entiers ? ");
        int nbEntiers = clavier.nextInt();
        int sommePairs = 0;
        int plusGrand = 0;
        int nbActuel;

        for (int i = 0; i < nbEntiers; i++) {
            System.out.print("Entrez un entier : ");
            nbActuel = clavier.nextInt();
            if (nbActuel > plusGrand || i == 0) {
                plusGrand = nbActuel;
            }
            if (nbActuel % 2 == 0) {
                sommePairs += nbActuel;
            }
        }
        System.out.println("Somme des nombres pairs = " + sommePairs + ", plus grand nombre = " + plusGrand);
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        sommePairsEtMax(clavier);
        clavier.close();
    }
}
