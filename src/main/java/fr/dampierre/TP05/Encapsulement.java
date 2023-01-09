package fr.dampierre.TP05;

public class Encapsulement {
    public static void main(String args[]) {
        CompteBancaire compte = new CompteBancaire("Watson", 100000);
        compte.debiter(60000);
        compte.crediter(15000);
        System.out.println(compte.afficher());
        compte.debiter(60000);
        System.out.println(compte.afficher());
    }
}
