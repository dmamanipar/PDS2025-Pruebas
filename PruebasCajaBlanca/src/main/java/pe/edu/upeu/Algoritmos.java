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


    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();

        int[] m = {11,15,2,7};
        int o=9;
        int[] p=a.sumaDosNumeros(m,o);
        System.out.println("["+p[0]+","+p[1]+"]");

    }




}
