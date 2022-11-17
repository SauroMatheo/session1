package fr.dampierre.TP03;

public class suite2 {
    public static void main(String[] args) {
        int max = 20;
        int avantDernier = 0;
        int dernier = 1;
        int actuel;

        String sortie = "0 1 ";

        for (int i = 0; i < max; i++) {
            actuel = dernier + avantDernier;
            avantDernier = dernier;
            dernier = actuel;

            sortie += actuel + " ";
        }

        System.out.println(sortie + "...");
    }
}
