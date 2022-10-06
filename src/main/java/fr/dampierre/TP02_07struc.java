package fr.dampierre;

public class TP02_07struc {
    // Cette méhode retourne le nombre d'entiers impairs parmi ses trois paramètres
    public static int nbImpairs(int nb1, int nb2, int nb3) { // Etait en void au lieu de int
        int nbImp = 0;
        if (nb1 % 2 != 0) {
            nbImp++;
        }
        if (nb2 % 2 != 0) { // /!\ Dans un else
            nbImp++;
        }
        if (nb3 % 2 != 0) { // /!\ Dans un else
            nbImp++;
        }
        return nbImp;
    }

    public static int newNbImpairs(int nb1, int nb2, int nb3) { // Maintenant sans if !
        int nbImp = nb1 % 2 + nb2 % 2 + nb3 % 2;
        return nbImp;
    }

    public static void main(String[] args) {
        System.out.println(nbImpairs(3, 2, 13));
        System.out.println(newNbImpairs(3, 2, 13));
    }
}
