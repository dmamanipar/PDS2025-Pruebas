package pe.edu.upeu;

public class Cuadradoperfec {

    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    // ---- Pruebas ----
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14)); // true
        System.out.println(isPerfectSquare(16)); // false
        System.out.println(isPerfectSquare(1));  // true
        System.out.println(isPerfectSquare(25)); // true
        System.out.println(isPerfectSquare(26)); // false
    }
}
