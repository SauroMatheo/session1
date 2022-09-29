package fr.dampierre;

import java.util.Scanner;

public class TP02pair {
    static boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nb = clavier.nextInt();

        clavier.close();

        if (estPair(nb)) {
            System.out.println(nb + " est un nombre pair.");
        } else {
            System.out.println(nb + " est un nombre impair.");
        }
    };
}
