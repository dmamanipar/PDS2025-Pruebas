package pe.edu.upeu;

public class Algoritmos {

    public int[] sumaDosNumeros(int[] m, int o){
        int[] p=new int[2];
        for (int i = 0; i < m.length-1; i++) {
            for (int j = i+1; j < m.length; j++) {
                if (m[i]+m[j]==o){
                    p[0]=i;
                    p[1]=j;
                    break;
                }
            }
        }
        return p;
    }


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

        int[] m = {11,15,2,7};
        int o=9;
        int[] p=a.sumaDosNumeros(m,o);
        System.out.println("["+p[0]+","+p[1]+"]");




        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("¿Es palíndromo '" + s1 + "'? RPTA:" + a.esPalindromoValido(s1));

        String s2 = "race a car";
        System.out.println("¿Es palíndromo '" + s2 + "'? RPTA:" + a.esPalindromoValido(s2));

        String s3 = " ";
        System.out.println("¿Es palíndromo '" + s3 + "'? RPTA:" + a.esPalindromoValido(s3));


    }



}
