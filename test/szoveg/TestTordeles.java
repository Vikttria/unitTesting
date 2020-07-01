package szoveg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTordeles {

    Tordeles tordeles;

    @Before
    public void setup(){
        tordeles = new Tordeles();
    }

    @Test
    public void testTordeles() {
        Assert.assertEquals(tordeles.tordeles("Ez egy almafa"), "Ez egy\nalmafa");
        Assert.assertEquals(tordeles.tordeles("Ez egy almafan van egy macska"), "Ez egy\nalmafan van\negy macska");
        Assert.assertEquals(tordeles.tordeles("lehet ezegynagyonhosszúszó"), "lehet\nezegynagyonh\nosszúszó");
    }

    @Test
    public void testTordeltSzoveg() {
        Assert.assertEquals(tordeles.tordeles("Ez egy almafa\namin van egy cica"), "Ez egy\nalmafa\namin van\negy cica");
    }
}
