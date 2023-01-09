package fr.dampierre.TP05;

public class CompteBancaire {
    private String nom;
    private int solde; // EN CENTIMES

    CompteBancaire(String nom, int solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public void debiter(int montant) {
        if (montant >= 0) {
            if (this.solde - montant >= 0) {
                this.solde -= montant;
            } else {
                System.err.println("Le solde ne peut pas atteindre les négatifs");
            }
        } else {
            System.err.println("Le débit ne peut pas être négatif");
        }
    }

    public void crediter(int montant) {
        if (montant >= 0) {
            this.solde += montant;
        } else {
            System.err.println("Le crédit ne peut pas être négatif");
        }
    }

    public String afficher() {
        return "nom: " + this.nom + "\nsolde: " + this.solde;
    }

}
