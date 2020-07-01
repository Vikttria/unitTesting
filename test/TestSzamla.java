import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSzamla {

    Szamla szla;

    @Before
    public void setup(){
        szla = new Szamla();
    }

    @Test
    public void testTerhelheto(){
        Assert.assertTrue(szla.terhelheto(500,500));
        Assert.assertTrue(szla.terhelheto(5000,2780));

        Assert.assertFalse(szla.terhelheto(500, 501));
        Assert.assertFalse(szla.terhelheto(5000, 6000));
    }

    @Test
    public void testJovairas(){
        Assert.assertEquals(szla.jovairas(1000,2200),3200);
        Assert.assertEquals(szla.jovairas(500,2200),2700);
    }

    @Test
    public void testTerheles(){
        Assert.assertEquals(szla.terheles(6000,5000), 1000);
        Assert.assertEquals(szla.terheles(500,50), 450);
        Assert.assertEquals(szla.terheles(10000,1500), 8500);
    }

}
