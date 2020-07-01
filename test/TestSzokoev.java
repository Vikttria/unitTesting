import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSzokoev {

    //Szökőév az, amely osztható 4-gyel, de a 100-zal osztható évek nem szökőévek, csak a 400-zal osztható évek

    Szokoev szokoev;

    @Before
    public void setup(){
        szokoev = new Szokoev();
    }

    @Test
    public void testEvNegy(){
        Assert.assertTrue(szokoev.szoko(2020));
        Assert.assertTrue(szokoev.szoko(2012));
        Assert.assertTrue(szokoev.szoko(2000));

        Assert.assertFalse(szokoev.szoko(2018));
        Assert.assertFalse(szokoev.szoko(1986));
        Assert.assertFalse(szokoev.szoko(111));
    }

    @Test
    public void testEvNegyszaz(){
        Assert.assertTrue(szokoev.szoko(2000));
        Assert.assertTrue(szokoev.szoko(800));
        Assert.assertTrue(szokoev.szoko(1600));

        Assert.assertFalse(szokoev.szoko(1100));
        Assert.assertFalse(szokoev.szoko(900));
        Assert.assertFalse(szokoev.szoko(2200));
    }


}
