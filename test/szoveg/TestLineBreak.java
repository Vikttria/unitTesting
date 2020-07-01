package szoveg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLineBreak {

    LineBreak lineBreak;

    @Test
    public void testLinesNumber(){
        lineBreak = new LineBreak(12);

        Assert.assertEquals(2, lineBreak.textLine("Ezen az almafá\nvan egy macska").length);
        Assert.assertEquals(3, lineBreak.textLine("Ezen az almafá\nvan\negymacska").length);
    }

    @Test
    public void testLongWord(){
        lineBreak = new LineBreak(12);

        Assert.assertEquals(lineBreak.longWordBreak("ezegynagyonhosszúszó"), "ezegynagyonh\nosszúszó");
        Assert.assertEquals(lineBreak.longWordBreak("12345678901234"), "123456789012\n34");
        Assert.assertEquals(lineBreak.longWordBreak("elkelkáposztásítalanítottátok"), "elkelkáposzt\násítalanítot\ntátok");

        lineBreak = new LineBreak(13);

        Assert.assertEquals(lineBreak.longWordBreak("ezegynagyonhosszúszó"), "ezegynagyonho\nsszúszó");
    }

    @Test
    public void testRestCharNumber(){
        lineBreak = new LineBreak(12);

        Assert.assertEquals(lineBreak.restCharNumber("eznagyonhosszúszó"), 5);
        Assert.assertEquals(lineBreak.restCharNumber("ezegynagyonhosszúszó"), 8);
        Assert.assertEquals(lineBreak.restCharNumber("eznagyonhosszúszólehet12123"), 3);
    }

    @Test
    public void testLineBreak(){
        lineBreak = new LineBreak(12);

        Assert.assertEquals(lineBreak.lineBreak("Ez egy almafa"), "Ez egy\nalmafa");
        Assert.assertEquals(lineBreak.lineBreak("Ez egy almaf"), "Ez egy almaf");
        Assert.assertEquals(lineBreak.lineBreak("Ez egy almafa amin van egy macska"), "Ez egy\nalmafa amin\nvan egy\nmacska");
        Assert.assertEquals(lineBreak.lineBreak("lehet ez egynagyonhosszúszó"), "lehet ez\negynagyonhos\nszúszó");
        Assert.assertEquals(lineBreak.lineBreak("ezegynagyonhosszúszó lehetett a sornak"), "ezegynagyonh\nosszúszó\nlehetett a\nsornak");
        Assert.assertEquals(lineBreak.lineBreak("ezegynagyonhosszúszó lehetett"), "ezegynagyonh\nosszúszó\nlehetett");

        lineBreak = new LineBreak(20);

        Assert.assertEquals(lineBreak.lineBreak("ezegynagyonhosszúszó lehetett a sornak"), "ezegynagyonhosszúszó\nlehetett a sornak");
        Assert.assertEquals(lineBreak.lineBreak("ezegynagyonhosszúszó lehetett"), "ezegynagyonhosszúszó\nlehetett");
    }

    @Test
    public  void testTextBreak(){
        lineBreak = new LineBreak(12);

        Assert.assertEquals(lineBreak.textBreak("Ez\negy almafa"), "Ez\negy almafa");
        Assert.assertEquals(lineBreak.textBreak("Ez\negy almafa amin van egy macska"), "Ez\negy almafa\namin van egy\nmacska");
        Assert.assertEquals(lineBreak.textBreak("Ez\negy almafa amin\nvan egy macska"), "Ez\negy almafa\namin\nvan egy\nmacska");

    }

}
