package ua.hillel.brizhak.homework.homework18;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.hillel.brizhak.homeworks.homework18.Main;

import java.util.Arrays;

public class TestAverageArithmetic {
    @Test
    void testMethod() {
        Assertions.assertEquals(-1, Main.averageArithmetic(new int [3][5]));
    }
    @Test
    void testMethod1() {
        Assertions.assertEquals(1, Main.averageArithmetic(new int [5][5]));
    }
    @Test
    void testMethod2() {
        Assertions.assertEquals(-2, Main.averageArithmetic(new int [5][0]));
    }
    @Test
    void testMethod3() {
        Assertions.assertEquals(-2, Main.averageArithmetic(new int [0][5]));
    }
    @Test
    void testMethod4() {
        Assertions.assertEquals(-1, Main.averageArithmetic(new int [][] {{1,5,3}, {1,5,1,6}}));
    }
}
