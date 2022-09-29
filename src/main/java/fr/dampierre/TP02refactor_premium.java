package fr.dampierre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TP02refactor_premium {
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

        String[] prenoms = { "Fred", "Cathy" };
        List<Integer> billets = new ArrayList<Integer>();

        for (int i = 0; i < prenoms.length; i++) {
            System.out.print("Combien va dépenser " + prenoms[i] + " ? ");
            billets.add(compteBillets(console.nextInt()));
        }

        console.close();

        for (int i = 0; i < prenoms.length; i++) {
            System.out.println(prenoms[i] + " aura besoin de " + billets.get(i) + " billets de 20.");
        }
    }
}
