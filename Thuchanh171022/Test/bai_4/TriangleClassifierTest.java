package bai_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void check() {
        int a = 1;
        int b = 3;
        int c = 5;
        boolean expected = false ;
        boolean result = TriangleClassifier.check(a, b, c);
        assertEquals(expected, result);
    }


    @Test
    void checkEquilateralTriangle() {
        int a = 3;
        int b = 3;
        int c = 3;
        boolean expected = true ;
        boolean result = TriangleClassifier.checkEquilateralTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void checkIsoscelesTriangle() {
        int a = 7;
        int b = 5;
        int c = 7;
        boolean expected = true ;
        boolean result = TriangleClassifier.checkIsoscelesTriangle(a, b, c);
        assertEquals(expected, result);
    }
}