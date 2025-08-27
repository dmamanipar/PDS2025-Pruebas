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

    public int longitudUltimaPalabra(String s){

        s = s.trim();

        String[] palabras = s.split("\\s+");

        return palabras[palabras.length - 1].length();
    }

    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        // Test suma dos números
        int[] m = {11,15,2,7};
        int o=9;
        int[] p=a.sumaDosNumeros(m,o);
        System.out.println("["+p[0]+","+p[1]+"]");

        System.out.println("=== Longitud de la última palabra ===");

        // Ejemplo 1
        String s1 = "Hello World";
        int resultado1 = a.longitudUltimaPalabra(s1);
        System.out.println("\"" + s1 + "\" -> " + resultado1);

        // Ejemplo 2
        String s2 = "   fly me   to   the moon  ";
        int resultado2 = a.longitudUltimaPalabra(s2);
        System.out.println("\"" + s2 + "\" -> " + resultado2);

        // Ejemplo 3
        String s3 = "luffy is still joyboy";
        int resultado3 = a.longitudUltimaPalabra(s3);
        System.out.println("\"" + s3 + "\" -> " + resultado3);
    }
}