package fr.dampierre;

import java.util.Scanner;

public class TP02_3refactor {
    static int compteBillets(int montant) {
        System.out.println();
        int nbBillets = montant / 20;
        if (nbBillets * 20 < montant) {
            nbBillets++;
        }
        return nbBillets;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Combien va dépenser Fred ? ");
        int nbFred = compteBillets(console.nextInt());

        System.out.print("Combien va dépenser Cathy ? ");
        int nbCathy = compteBillets(console.nextInt());

        console.close();

        System.out.println("Fred aura besoin de " + nbFred + " billets de 20.");
        System.out.println("Cathy aura besoin de " + nbCathy + " billets de 20.");
    }
}
