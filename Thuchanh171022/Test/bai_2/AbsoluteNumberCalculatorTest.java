package bai_2;//import org.junit.Test;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class bai_2.AbsoluteNumberCalculatorTest {
//    @Test
//    static void testFindAbsoluteO(){
//        int number = 0;
//        int expected = 0;
//
//        int result = AbsoluteNumberCalculator.findAbsolute(number);
//        assertEquals(expected, result);
//    }
//    @Test
//    public static void testFindAbsolute1() {
//        int number = 1;
//        int expected = 1;
//        int result = AbsoluteNumberCalculator.findAbsolute(number);
//        assertEquals(expected, result);
//    }
//    @Test
//    static void testFindAbsoluteNegative1() {
//        int number = -1;
//        int expected = -1;
//        int result = AbsoluteNumberCalculator.findAbsolute(number);
//        assertEquals(expected, result);
//    }
//
//}



import bai_2.AbsoluteNumberCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}