package fr.dampierre.TP05;

public class POO1 {
    public static void main(String[] args) {
        Employe stanley = new Employe("Parable", "Stanley", 20, 200000);
        Employe jon = new Employe("Arbuckle", "Jon", 30, 200000);

        jon.augmentation(20);

        System.out.println(stanley.decrire());
        System.out.println("=====");
        System.out.println(jon.decrire());
    }
}
