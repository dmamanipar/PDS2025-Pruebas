package pe.edu.upeu;

public class AgregarBinario {

    public String sumarBinarios(String a, String b) {
        StringBuilder resultado = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; // Variable para el acarreo

        // Procesar desde el último dígito hacia el primero
        while (i >= 0 || j >= 0 || carry > 0) {
            int suma = carry;

            // Agregar dígito de la cadena 'a' si existe
            if (i >= 0) {
                suma += a.charAt(i) - '0';
                i--;
            }

            // Agregar dígito de la cadena 'b' si existe
            if (j >= 0) {
                suma += b.charAt(j) - '0';
                j--;
            }

            // El resultado es suma % 2, el carry es suma / 2
            resultado.append(suma % 2);
            carry = suma / 2;
        }

        // Como construimos el resultado al revés, necesitamos invertirlo
        return resultado.reverse().toString();
    }

    // Método alternativo usando conversión a enteros (menos eficiente para números grandes)
    public String sumarBinariosAlternativo(String a, String b) {
        // Convertir a enteros, sumar y convertir de vuelta a binario
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int suma = numA + numB;
        return Integer.toBinaryString(suma);
    }

    public static void main(String[] args) {
        AgregarBinario ab = new AgregarBinario();

        // Ejemplo 1: a = "11", b = "1"
        String a1 = "11";
        String b1 = "1";
        String resultado1 = ab.sumarBinarios(a1, b1);
        System.out.println("a = \"" + a1 + "\", b = \"" + b1 + "\"");
        System.out.println("Output: \"" + resultado1 + "\"");
        System.out.println("Verificación: " + a1 + " + " + b1 + " = " + resultado1);
        System.out.println();

        // Ejemplo 2: a = "1010", b = "1011"
        String a2 = "1010";
        String b2 = "1011";
        String resultado2 = ab.sumarBinarios(a2, b2);
        System.out.println("a = \"" + a2 + "\", b = \"" + b2 + "\"");
        System.out.println("Output: \"" + resultado2 + "\"");
        System.out.println("Verificación: " + a2 + " + " + b2 + " = " + resultado2);
    }
}