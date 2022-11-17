package fr.dampierre.TP03;

public class suite3_4 {
    public static void main(String[] args) {
        int max = 20;

        String sortie = "";

        /*
         * SUITE 3
         * for (int i = 0; i < max; i++) {
         * sortie += i * i + " ";
         * }
         */

        // SUITE 4
        for (int i = 0; i < max; i++) {
            sortie += Math.round(Math.pow(i, 2)) + " ";
        }

        System.out.println(sortie + "...");
    }
}
