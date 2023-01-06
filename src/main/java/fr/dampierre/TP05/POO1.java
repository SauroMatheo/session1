package fr.dampierre.TP05;

public class POO1 {
    public static void decrire(Employe employe, String nom) {
        System.out.println("Caractéristiques de " + nom + ":");
        System.out.println("    * nom: " + employe.nom);
        System.out.println("    * prenom: " + employe.prenom);
        System.out.println("    * age: " + employe.age);
        System.out.println("    * salaire: " + employe.salaire);
    }

    public static void main(String[] args) {
        Employe stanley = new Employe("Parable", "Stanley", 20, 2000);
        Employe jon = new Employe("Arbuckle", "Jon", 30, 2000);

        jon.augmentation(20);

        decrire(stanley, "stanley");
        System.out.println("=====");
        decrire(jon, "jon");
    }
}
