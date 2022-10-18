package fr.dampierre.TP02;

public class XO15nbMots {
    static int nbMots(String text) {
        int count = 1;
        char avant = text.charAt(0);
        char chara;
        char apostrophe = "'".charAt(0);
        for (int i = 1; i < text.length(); i++) {
            chara = text.charAt(i);
            if ((Character.isWhitespace(chara) || chara == apostrophe) && Character.isLetter(avant)) {
                count++;
            }
            avant = text.charAt(i);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(nbMots("Bonjour tout le monde")); // retourne 4
        System.out.println(nbMots("je-suis-un-robot")); // retourne 4
        System.out.println(nbMots("   Plein    d'espaces...      et de la ponctuation !!!   ")); // retourne 7
    }
}
