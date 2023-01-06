package fr.dampierre.TP05;

public class Employe {
    String nom;
    String prenom;
    int age;
    int salaire; // EN CENTIMES

    Employe(String nom, String prenom, int age, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaire = salaire; // EN CENTIMES
    }

    void augmentation(double pourcent) {
        this.salaire *= 1 + pourcent / 100;
    }
}