package fundamentals.fridge;

import lt.sdacademy.fundamentalstesting.fridge.Fridge;
import lt.sdacademy.fundamentalstesting.fridge.NoSuchItemExeption;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FoodTesting {

    @Test
    public void testFridge() {
        //given
        Fridge fridge = new Fridge();

        // when
        fridge.put("cheese");

        //then
        assertEquals(true, fridge.contains("cheese"));
        assertNotEquals(false, fridge.put("cheese"));
        assertEquals(true, fridge.contains("cheese"));

        assertEquals(false, fridge.contains("ham"));

        fridge.put("ham");
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(true, fridge.contains("ham"));

        try {
            fridge.take("sausage");
            Assert.fail("There was no sausage in the fridge!");

        } catch (NoSuchItemExeption e) {
            //ok
        }
    }

    @Test
    public void testNosuchItemsExeption() {
        // given
        Fridge fridge = new Fridge();

        try {
            fridge.take("sausage");
            Assert.fail("There was no sausage in the fridge!");
        } catch (NoSuchItemExeption e) {
            //ok
        }
    }

    @Test
    private void testFridgeSize() {
        // given
        Fridge fridge = new Fridge();
        fridge.put("sausage");
        fridge.put("ham");
        fridge.put("cheese");
        //when
        int result = fridge.getFridgeSize();
        // then
        Assert.assertEquals(3, result);
    }
}
