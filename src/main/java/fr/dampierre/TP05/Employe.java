package fr.dampierre.TP05;

public class Employe {
    String nom;
    String prenom;
    int age;
    double salaire;

    Employe(String nom, String prenom, int age, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire;
    }

    void augmentation(double pourcent) {
        this.salaire *= 1 + pourcent / 100;
    }
}