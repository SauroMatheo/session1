package fr.dampierre.TP05;

public class Employe {
    private String nom;
    private String prenom;
    private int age;
    private int salaire; // EN CENTIMES

    Employe(String nom, String prenom, int age, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire; // EN CENTIMES
    }

    void augmentation(double pourcent) {
        this.salaire *= 1 + pourcent / 100;
    }

    String decrire() {
        return "nom: " + this.nom + "\nprenom: " + this.prenom + "\nage: " + this.age + "\nsalaire: " + this.salaire;
    }

    // GETTERS

    /*
     * // PRE-TELL DON"T ASK
     * public String getNom() {
     * return nom;
     * }
     * 
     * public String getPrenom() {
     * return prenom;
     * }
     * 
     * public int getAge() {
     * return age;
     * }
     * 
     * public int getSalaire() {
     * return salaire;
     * }
     */

    // SETTERS
}