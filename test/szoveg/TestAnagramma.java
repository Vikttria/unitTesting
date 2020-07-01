package szoveg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAnagramma {

    Anagramma anagramma;

    @Before
    public void setup(){
        anagramma = new Anagramma();
    }

    @Test
    public void testAnagramma(){
        Assert.assertTrue(anagramma.anagramma("alma", "alma"));
        Assert.assertTrue(anagramma.anagramma("alma", "lama"));
        Assert.assertTrue(anagramma.anagramma("alma", "aalm"));

        Assert.assertFalse(anagramma.anagramma("alma", "lesz"));
    }

}
