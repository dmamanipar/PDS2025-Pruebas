package pe.edu.upeu;


public class Ejercicio3 {

    // Método para encontrar el prefijo común más largo
    public String prefijoComunMasLargo(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                if (prefix.length() == 0) return "";
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Ejercicio3 a = new Ejercicio3();

        String[] ejemplo1 = {"flower", "flow", "flight"};
        System.out.println(a.prefijoComunMasLargo(ejemplo1)); // Output: "fl"

        String[] ejemplo2 = {"dog", "racecar", "car"};
        System.out.println(a.prefijoComunMasLargo(ejemplo2)); // Output: ""
    }
}