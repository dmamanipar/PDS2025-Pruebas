package pe.edu.upeu;

public class Algoritmos {

    public int[] sumaDosNumeros(int[] m, int o) {
        int[] p = new int[2];
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] + m[j] == o) {
                    p[0] = i;
                    p[1] = j;
                    break;
                }
            }
        }
        return p;
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int total = carry;

            if (i >= 0) {
                total += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                total += b.charAt(j) - '0';
                j--;
            }

            result.append(total % 2);
            carry = total / 2;
        }

        return result.reverse().toString();
    }
}