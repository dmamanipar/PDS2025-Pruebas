package pe.edu.upeu;

public class JackAlgoritmo5 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Apunta al siguiente lugar donde poner un valor único
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        JackAlgoritmo5 ja = new JackAlgoritmo5();
        int[] nums = {0,0,1,1,1,2,2,3,3,4, 5, 5};
        int k = ja.removeDuplicates(nums);
        System.out.println("k = " + k);
        // Imprime primeros k elementos (los únicos)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}