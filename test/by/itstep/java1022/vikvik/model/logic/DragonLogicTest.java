package by.itstep.java1022.vikvik.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class DragonLogicTest {

    @Test
    public void testNegativeAge() {
        int age = -100;
        int expected = 0;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testZeroAge() {
        int age = 0;
        int expected = 0;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testFirstPeriodBetween1and200() {
        int age = 100;
        int expected = 303;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }
    @Test
    public void testAgeWith1() {
        int age = 1;
        int expected = 6;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testAgeWith200() {
        int age = 200;
        int expected = 603;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testSecondPeriodBetween201and300() {
        int age = 250;
        int expected = 703;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testAgeWith201() {
        int age = 201;
        int expected = 605;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testAgeWith300() {
        int age = 300;
        int expected = 803;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testThirdPeriodMoreThan301() {
        int age = 400;
        int expected = 903;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }

    @Test
    public void testAgeWith301() {
        int age = 301;
        int expected = 804;

        int actual = DragonLogic.countDragonHeads(age);

        assertEquals(expected, actual);
    }
}