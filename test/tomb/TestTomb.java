package tomb;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTomb {

    Tomb tomb;

    @Before
    public void setup(){
        tomb = new Tomb();
    }

    @Test
    public void testFordit(){
        Assert.assertArrayEquals(tomb.fordit(new int[]{5, 3, 2, 1}), new int[]{1, 2, 3, 5});
        Assert.assertArrayEquals(tomb.fordit(new int[]{5, 3, 2, 1, 4, 5}), new int[]{5, 4, 1, 2, 3, 5});
    }

    @Test
    public void TestForditForEach() {

        Assert.assertArrayEquals(tomb.fordit2(new int[]{5, 3, 2, 1}), new int[]{1, 2, 3, 5});
        Assert.assertArrayEquals(tomb.fordit2(new int[]{5, 3, 2, 1, 4, 5}), new int[]{5, 4, 1, 2, 3, 5});
    }

}
