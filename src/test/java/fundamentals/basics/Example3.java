package fundamentals.basics;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class Example3 {


    @Test
    public void testAsserEquals() {

        //given
        int firstNum = 2;
        int secondNum = 32;

        //when
        int result = firstNum * secondNum;

        //then
        assertEquals(64, 2 * 32);
        assertNotEquals("Value ar not equal", 1, 2);
    }

    @Test
    public void testAssertTrueFalse() {
        assertTrue(3 == 3);
        assertFalse("Hello".equals("Not Hello"));
    }

    @Ignore
    @Test
    public void testArrayEquals() {
        int[] fisrtArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        assertNotEquals(fisrtArray, secondArray);
    }

    @Test
    public void testAssertNull() {
        String s = null;
        assertNull(s);
    }

    @Test
    public void testAssertSame() {
        String s1 = "abc";
        String s2 = "abc";
        assertSame(s1, s2);
    }
}
