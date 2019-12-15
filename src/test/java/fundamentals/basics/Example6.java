package fundamentals.basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Example6 {
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Run before the firsr test method");
    }

    @AfterClass
    public static void thearDownAfterClass() {
        System.out.println("Run after the last test");
    }

    @Before
    public void setUp() {
        System.out.println("Run before each test");
    }

    @After
    public void ternDown() {
        System.out.println("Run after each test");
    }

    @Test
    public void testEsample1() {
        System.out.println("Implementation of the first test");
        assertEquals(1, 1);
    }

    @Test
    public void testExample2() {
        System.out.println("Implemantation of the second test");
        assertNotEquals(1, 0);
    }

}
