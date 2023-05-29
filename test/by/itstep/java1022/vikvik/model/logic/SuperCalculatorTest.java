package by.itstep.java1022.vikvik.model.logic;

import org.junit.*;

import static org.junit.Assert.*;

public class SuperCalculatorTest {
    private static SuperCalculator calc;

    public SuperCalculatorTest(){
        System.out.println("create SuperCalculatorTest object");
    }

    @BeforeClass
    public static void init() {
        System.out.println("BeforeClass");
        calc = new SuperCalculator();
    }

    @AfterClass
    public static void destroy() {
        System.out.println("AfterClass");
        calc = null;
    }

    @Before
    public void setUp() {
        System.out.println("before");
//        calc = new SuperCalculator();
    }


    @After
    public void tearDown(){
        System.out.println("after");
//        calc = null;
    }

    @Test
    public void add() {
        System.out.println("test add");
        int a = 10;
        int b = 20;
        int expected = 30;

        int actual = calc.add(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void sub() {
        System.out.println("test sub");
        int a = 10;
        int b = 20;
        int expected = -10;

        int actual = calc.sub(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void mul() {
        System.out.println("test mul");
    }

    @Test
    public void div() {
        System.out.println("test div");
    }
}