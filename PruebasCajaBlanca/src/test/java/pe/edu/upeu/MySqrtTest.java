package pe.edu.upeu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MySqrtTest {

    @Order(1)
    @Test
    public void testPerfectSquare() {
        MySqrt sqrtCalc = new MySqrtImpl();
        int result = sqrtCalc.mySqrt(4);
        Assertions.assertEquals(2, result);
    }

    @Order(2)
    @Test
    public void testNonPerfectSquare() {
        MySqrt sqrtCalc = new MySqrtImpl();
        int result = sqrtCalc.mySqrt(8);
        Assertions.assertEquals(2, result);
    }

    @Order(3)
    @Test
    public void testZero() {
        MySqrt sqrtCalc = new MySqrtImpl();
        int result = sqrtCalc.mySqrt(0);
        Assertions.assertEquals(0, result);
    }

    @Order(4)
    @Test
    public void testOne() {
        MySqrt sqrtCalc = new MySqrtImpl();
        int result = sqrtCalc.mySqrt(1);
        Assertions.assertEquals(1, result);
    }

    @Order(5)
    @Test
    public void testLargeNumber() {
        MySqrt sqrtCalc = new MySqrtImpl();
        int result = sqrtCalc.mySqrt(2147395599);
        Assertions.assertEquals(46339, result);
    }
}
