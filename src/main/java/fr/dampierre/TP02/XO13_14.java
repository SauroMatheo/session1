package fr.dampierre.TP02;

public class XO13_14 {
    static boolean deuxSens(String text) {
        String reversed = new StringBuffer(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    static boolean deuxSensComplexe(String text) {
        text = text.toLowerCase();
        int len = text.length();
        for (int i = 0; i < len; i++) {
            if (Character.compare(text.charAt(i), text.charAt(len - i - 1)) != 0) {
                return false;
            }
        }
        return true;
    }

    static String retirePonctuation(String text) {
        String compact = "";

        for (int i = 0; i < text.length(); i++) {
            char chara = text.charAt(i);
            if (Character.isLetter(chara)) {
                compact += chara;
            }
        }
        return compact;
    }

    static boolean deuxSensClement(String text) {
        text = retirePonctuation(text);
        String reversed = new StringBuffer(text).reverse().toString();

        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println("COMPLEXE");
        System.out.println(deuxSensComplexe("quelconque")); // affichera 'false' car "quelconque" pas pareil que
                                                            // "euqnocleuq"
        System.out.println(deuxSensComplexe("kayak")); // 'true'
        System.out.println(deuxSensComplexe("Un radar NU")); // 'true' (insensible à la casse)
        System.out.println(deuxSensComplexe("Éric notre valet alla te laver ton ciré")); // 'false' (à cause des espaces
                                                                                         // et de
        // la ponctuation)
        // Ce dernier exemple fonctionne aussi avec "Luc" à la place de "Eric"

        System.out.println("===\nNORMAL");
        System.out.println(deuxSens("quelconque")); // affichera 'false' car "quelconque" pas pareil que "euqnocleuq"
        System.out.println(deuxSens("kayak")); // 'true'
        System.out.println(deuxSens("Un radar NU")); // 'true' (insensible à la casse)
        System.out.println(deuxSens("Éric notre valet alla te laver ton ciré")); // 'false' (à cause des espaces et de
                                                                                 // la ponctuation)
        // Ce dernier exemple fonctionne aussi avec "Luc" à la place de "Eric"

        System.out.println("===\nSANS ESPACES");
        System.out.println(deuxSensClement("quelconque")); // affichera 'false' car "quelconque" pas pareil que
                                                           // "euqnocleuq"
        System.out.println(deuxSensClement("kayak")); // 'true'
        System.out.println(deuxSensClement("Un radar NU")); // 'true' (insensible à la casse)
        System.out.println(deuxSensClement("Éric notre valet alla te laver ton ciré"));
        // Ce dernier exemple fonctionne aussi avec "Luc" à la place de "Eric"
    }
}
