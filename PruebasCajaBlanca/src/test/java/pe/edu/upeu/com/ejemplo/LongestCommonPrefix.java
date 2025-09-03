package pe.edu.upeu.com.ejemplo;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] ejemplo1 = {"flower", "flow", "flight"};
        String[] ejemplo2 = {"dog", "racecar", "car"};

        System.out.println("Ejemplo 1: " + longestCommonPrefix(ejemplo1)); // "fl"
        System.out.println("Ejemplo 2: " + longestCommonPrefix(ejemplo2)); // ""
    }
}
