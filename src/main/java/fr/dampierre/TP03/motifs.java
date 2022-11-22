package fr.dampierre.TP03;

public class motifs {
    public static void repete_char(String chara, int nb, boolean newline) {
        String sortie = "";

        for (int i = 0; i < nb; i++) {
            sortie += chara;
        }

        if (newline) {
            System.out.println(sortie);
        } else {
            System.out.print(sortie);
        }
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

    // ##MOTIFS## //
    public static void motif1(int colonnes) {
        repete_char("-", colonnes, true);
        vague1(colonnes);
        repete_0a9(2, 1, true, colonnes);
        repete_char("-", colonnes, true);
    }

    // Escaliers
    public static void motif2(int colonnes) {
        for (int i = 0; i < colonnes; i++) {
            repete_char("*", colonnes, true);
        }
    }

    public static void motif3(int colonnes) {
        for (int i = 0; i < colonnes; i++) {
            repete_char("*", i + 1, true);
        }
    }

    public static void motif4(int colonnes) {
        for (int i = 0; i < colonnes; i++) {
            repete_char("" + (i + 1), i + 1, true);
        }
    }

    public static void motif5(int colonnes) {
        for (int i = 0; i < colonnes; i++) {
            repete_char(" ", colonnes - i - 1, false);
            System.out.println(i + 1);
        }
    }

    public static void motif6(int colonnes) {
        for (int i = 0; i < colonnes; i++) {
            repete_char(" ", colonnes - i - 1, false);
            repete_char("" + (i + 1), i + 1, true);
        }
    }

    // Répétes-chiffres

    public static void motif7(int colonnes) {
        repete_0a9(3, 0, false, colonnes);
    }

    public static void main(String[] args) {
        motif1(40);

        // Escaliers
        motif2(5);
        motif3(5);
        motif4(5);
        motif5(5);
        motif6(5);

        // Répétes-chiffres
        motif7(30);
    }
}
