import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMatek {

    Matek matek;

    @Before
    public void setup(){
        matek = new Matek();
    }

    //legnagyobb közös osztó
    @Test
    public void testLNKO(){
        Assert.assertEquals(7, matek.lnko(14, 21));
        Assert.assertEquals(2, matek.lnko(4,6));
        Assert.assertEquals(1, matek.lnko(5,21));

        Assert.assertNotEquals(7, matek.lnko(14,28));
        Assert.assertNotEquals(6, matek.lnko(12,28));
    }

    //legkisebb közös többszörös
    @Test
    public void testLKKT(){
        Assert.assertEquals(12, matek.lkkt(6,4));
        Assert.assertEquals(8, matek.lkkt(8,4));
        Assert.assertEquals(12, matek.lkkt(6,4));

        Assert.assertNotEquals(24, matek.lkkt(6,4));
        Assert.assertNotEquals(32, matek.lkkt(8,4));
        Assert.assertNotEquals(30, matek.lkkt(8,3));

    }
}
