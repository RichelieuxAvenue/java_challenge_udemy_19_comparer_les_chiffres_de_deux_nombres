public class Main {

    public static boolean hasSharedDigit(int nombre1, int nombre2) {
        // Vérifier si les nombres sont dans l'intervale de 10(inclus) à 99(inclus)
        if (nombre1 < 10 || nombre2 < 10 || nombre1 > 99 || nombre2 > 99) {
            return false;
        }

        // Extraire les chiffres des deux nombres
        int dernierChiffreNombre1 = nombre1 % 10;  // Dernier chiffre de nombre1
        int premierChiffreNombre1 = nombre1 / 10;  // Premier chiffre de nombre1

        int dernierChiffreNombre2 = nombre2 % 10;  // Dernier chiffre de nombre2
        int premierChiffreNombre2 = nombre2 / 10;  // Premier chiffre de nombre2

        // Comparer les chiffres pour voir s'il y a un chiffre commun
        return (premierChiffreNombre1 == premierChiffreNombre2) ||
                (premierChiffreNombre1 == dernierChiffreNombre2) ||
                (dernierChiffreNombre1 == premierChiffreNombre2) ||
                (dernierChiffreNombre1 == dernierChiffreNombre2);
    }

    public static void main(String[] args) {
        // Test des exemples donnés
        System.out.println(hasSharedDigit(12, 23));  // true
        System.out.println(hasSharedDigit(9, 99));   // false
        System.out.println(hasSharedDigit(15, 55));  // true
    }
}