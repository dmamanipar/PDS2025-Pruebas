package pe.edu.upeu;

public class PalindromoValido {

    public boolean esPalindromoValido(String s) {

        String cadenaLimpia = s.toLowerCase().replaceAll("[^a-z0-9]", "");


        int izquierda = 0;
        int derecha = cadenaLimpia.length() - 1;

        while (izquierda < derecha) {
            if (cadenaLimpia.charAt(izquierda) != cadenaLimpia.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }


    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("¿Es palíndromo '" + s1 + "'? " + a.esPalindromoValido(s1));

        String s2 = "race a car";
        System.out.println("¿Es palíndromo '" + s2 + "'? " + a.esPalindromoValido(s2));

        String s3 = " ";
        System.out.println("¿Es palíndromo '" + s3 + "'? " + a.esPalindromoValido(s3));

    }

}
