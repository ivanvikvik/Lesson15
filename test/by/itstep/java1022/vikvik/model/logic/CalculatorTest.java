package by.itstep.java1022.vikvik.model.logic;


import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    //AAA rule - Arrange - Act - Assert


    @Test
    public void testAddPositive() {
        //Arrange
        int a = 10;
        int b = 20;
        int expected = 30;

        //Act
        int actual = Calculator.add(a, b);

        //Assert
        if (expected != actual) {
            throw new AssertionError();
        }
    }

    @Test
    public void testSubPositive() {
        //Arrange
        int a = 10;
        int b = 20;
        int expected = -10;

        //Act
        int actual = Calculator.sub(a, b);

        //Assert
        if (expected != actual) {
//            Assert.fail();
            fail();
        }
    }

    @Test
    public void testMulPositive() {
        //Arrange
        int a = 10;
        int b = 20;
        int expected = 200;

        //Act
        int actual = Calculator.mul(a, b);

        //Assert
//        Assert.assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

    @Test(timeout = 4000)
    public void testMulPerformance() {
        //Arrange
        int a = 10;
        int b = 20;

        //Act
        Calculator.mul(a, b);
    }

    @Test
    public void testDivPositive() {
        //Arrange
        int a = 100;
        int b = 20;
        int expected = 5;

        //Act
        int actual = Calculator.div(a, b);

        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        //Arrange
        int a = 100;
        int b = 0;

        //Act
        Calculator.div(a, b);
    }

//    @Test
//    public void testDivByZero() {
//        //Arrange
//        int a = 100;
//        int b = 1;
//
//        //Act
//        try {
//            Calculator.div(a, b);
//            fail();
//        } catch(ArithmeticException exception) {
//            //...
//        }
//
//    }
}
