package pe.edu.upeu;

import java.math.BigInteger;

public class MatrizNumero {
    public int matrizNumero(int[] matriz) {
        int suma=0;
        int exp=0;
        int expo=0;
        for(int i = matriz.length - 1; i >= 0 ; i--){
            expo= (int) Math.pow(10,exp);
            suma=(expo*matriz[i])+suma;
            exp++;
        }
        return suma;
    }
    BigInteger matrizNumeroBig(int[] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int d : matriz) {
            sb.append(d);
        }
        return new BigInteger(sb.toString());
    }

}