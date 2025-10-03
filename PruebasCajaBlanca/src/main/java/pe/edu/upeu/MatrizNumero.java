package pe.edu.upeu;

import java.math.BigInteger;

public class MatrizNumero {

    BigInteger matrizNumeroBig(int[] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int d : matriz) {
            if (d < 0 || d > 9) {
                throw new IllegalArgumentException("Cada dígito debe estar entre 0 y 9");
            }
        }
        for (int d : matriz) {
            sb.append(d);
        }
        return new BigInteger(sb.toString());
    }

}