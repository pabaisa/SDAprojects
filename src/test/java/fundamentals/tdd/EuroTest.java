package fundamentals.tdd;

import com.sun.jmx.snmp.EnumRowStatus;
import lt.sdacademy.fundamentalstesting.tdd.Euro;
import org.junit.Assert;
import org.junit.Test;

public class EuroTest {
    @Test
    public void getAmauntInText() {
        Assert.assertEquals("EUR 2.00", new Euro(2).toString());
        Assert.assertEquals("EUR 7.00", new Euro(7).toString());
    }
    @Test
    public void testEquality(){
        Assert.assertTrue(new Euro (2).equal(new Euro(2)));
        Assert.assertFalse(new Euro(20).equals(new Euro(21)));
    }
    @Test
    public void testSubtraction(){
        Euro euro = new Euro (10);
        Assert.assertEquals(4, euro.subtract(6));
    }
  /*  @Test
    public void testDivision(){
        Assert.assertEquals(9, new Euro(18).divide(new Euro(2)));
    }*/
}
