package pe.edu.upeu;

public class PrefijoComunImpl implements PrefijoComun {

    @Override
    public String encontrarPrefijoMasLargo(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Determinar la longitud mínima entre las cadenas
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s == null) {
                return ""; // Si hay null, no hay prefijo común
            }
            minLen = Math.min(minLen, s.length());
        }

        // Recorremos carácter por carácter
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    // Si encontramos diferencia, devolvemos lo acumulado
                    return strs[0].substring(0, i);
                }
            }
        }
        // Si no hubo diferencias, retornamos toda la longitud mínima
        return strs[0].substring(0, minLen);
    }
}
