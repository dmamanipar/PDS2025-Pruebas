package pe.edu.upeu;

public class Algoritmo9 {
    public int[] incrementarMatriz(int[] m){
        int l = m.length;
        for(int i=l-1;i>=0;i--){
            if(m[i]<9){
                m[i]++;
                return m;
            }
            m[i]=0;
        }
        int[] resul = new int[l + 1];
        resul[0]=1;
        return resul;
    }
}
