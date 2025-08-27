package pe.edu.upeu;

import java.util.Arrays;

public class Algoritmo {

    public int buscarPosicionInsercion(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >>> 1);
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }

    public static void main(String[] args) {
        Algoritmo a = new Algoritmo();
        int[] nums = {1, 3, 5, 6};
        int[] targets = {5, 2, 7, 0};

        for (int t : targets) {
            int pos = a.buscarPosicionInsercion(nums, t);
            System.out.println("nums=" + Arrays.toString(nums) + ", target=" + t + " -> " + pos);
        }
    }
}
