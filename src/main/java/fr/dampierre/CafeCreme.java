package fr.dampierre;

import java.util.Scanner;

public class CafeCreme {
    static void println(String text) {
        System.out.println(text);
    }

    static Integer demandePieces(int pieceCents, Scanner clavier) {
        println("Combien de pièces de " + pieceCents + " ?");
        return clavier.nextInt() * pieceCents;
    }

    public static void main(String[] args) {
        int coutCafe = 100;
        int total = 0;

        Scanner clavier = new Scanner(System.in);
        total += demandePieces(1, clavier);
        total += demandePieces(5, clavier);
        total += demandePieces(10, clavier);
        total += demandePieces(20, clavier);
        total += demandePieces(50, clavier);
        clavier.close();

        if (total < coutCafe) {
            println("Il vous manque " + (coutCafe - total) + " cents pour prendre un café.");
        } else if (total == coutCafe) {
            println("Vous avez exactement de quoi vous payer le café !");
        } else {
            println("Il vous restera " + (total - coutCafe) + " cents après avoir pris votre café !");
        }
    }
}
