package fr.dampierre.TP03;

public class motifs {
    public static void repete_char(String chara, int nb) {
        String sortie = "";

        for (int i = 0; i < nb; i++) {
            sortie += chara;
        }

        System.out.println(sortie);
    }

    public static void vague1(int nb) {
        String sortie = "";
        for (int i = 0; i < nb; i++) {
            if (i % 4 == 0) {
                sortie += "_";
            } else if (i % 4 == 2) {
                sortie += "^";
            } else {
                sortie += "-";
            }
        }

        System.out.println(sortie);
    }

    public static int de0a9(int i, int repete, int debut) {
        return ((Math.floorDiv(i, repete) + 1) % 10 + debut - 1);
    }

    public static void repete_0a9(int repete, int debut, boolean inverse, int nb) {
        String sortie = "";

        if (inverse) {
            for (int i = nb - 1; i >= 0; i--) {
                sortie += de0a9(i, repete, debut);
            }
        } else {
            for (int i = 0; i < nb; i++) {
                sortie += de0a9(i, repete, debut);
            }
        }

        System.out.println(sortie);
    }

    public static void main(String[] args) {
        int colonnes = 40;

        // MOTIF 1
        repete_char("-", colonnes);
        vague1(colonnes);
        repete_0a9(2, 1, true, colonnes);
        repete_char("-", colonnes);
    }
}
