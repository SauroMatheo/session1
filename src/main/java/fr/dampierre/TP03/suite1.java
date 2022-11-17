package fr.dampierre.TP03;

public class suite1 {
    public static void main(String[] args) {
        // Suite 1
        int suite1 = -4;
        String sortie1 = "" + suite1;
        for (int i = 0; i < 5; i++) {
            suite1 += 18;
            sortie1 += " " + suite1;
        }
        System.out.println(sortie1);
    }
}
