package tomb;

import org.junit.Assert;
import org.junit.Test;

public class TestPolinom {

    Polinom polinom;

    @Test
    public void testValue(){
        polinom = new Polinom(new int[]{1,2,0,1,-6});
        Assert.assertEquals(28, polinom.value(2));

        polinom = new Polinom(new int[]{1,2,3,4});
        Assert.assertEquals(26, polinom.value(2));
        Assert.assertEquals(112, polinom.value(4));
    }
    @Test
    public void testAdd(){
        polinom = new Polinom(new int[]{1,2,0,1,-6}, new int[]{1,2,3,4});

        Assert.assertEquals(54, polinom.add(2, 2));
    }

    @Test
    public void testMultiply(){
        polinom = new Polinom(new int[]{1,2,0,1,-6}, new int[]{1,2,3,4});

        Assert.assertEquals(728, polinom.multiply(2, 2));
    }

}
