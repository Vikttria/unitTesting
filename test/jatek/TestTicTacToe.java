package jatek;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTicTacToe {

    TicTacToe ticTacToe;

    @Before
    public void setup(){
        ticTacToe = new TicTacToe();
    }

    @Test
    public void testTableCreation(){
        Assert.assertEquals(3, ticTacToe.boardWidth());
        Assert.assertEquals(3, ticTacToe.boardHeight());
        Assert.assertEquals(9, ticTacToe.boardSize());
        Assert.assertEquals(9, ticTacToe.freeFields());
        Assert.assertTrue(ticTacToe.isFree(1,1));
        Assert.assertTrue(ticTacToe.isFree(0,2));
        Assert.assertTrue(ticTacToe.isFree(1,0));
    }

    @Test
    public void testPutSymbols(){
        Assert.assertTrue(ticTacToe.isFree(1,1));
        Assert.assertTrue(ticTacToe.put(1,1, 'X'));

        Assert.assertFalse(ticTacToe.isFree(1,1));
        Assert.assertEquals(8, ticTacToe.freeFields());
    }

    @Test
    public void testWrongSymbols(){
        Assert.assertFalse(ticTacToe.put(1,1, 'S'));
        Assert.assertFalse(ticTacToe.put(1,1, 'H'));
        Assert.assertFalse(ticTacToe.put(1,1, 'N'));
    }

    @Test
    public void testWrongPlayers(){
        Assert.assertTrue(ticTacToe.put(1,1,'X'));
        Assert.assertFalse(ticTacToe.put(2,1,'X'));
    }

    @Test
    public void testVictoryGame(){
        Assert.assertEquals('\0', ticTacToe.getWinner());
        ticTacToe.put(1,1,'X');
        Assert.assertEquals('\0', ticTacToe.getWinner());
        ticTacToe.put(0,1,'O');
        Assert.assertEquals('\0', ticTacToe.getWinner());
        ticTacToe.put(1,0,'X');
        Assert.assertEquals('\0', ticTacToe.getWinner());
        ticTacToe.put(2,2,'O');
        Assert.assertEquals('\0', ticTacToe.getWinner());
        ticTacToe.put(1,2,'X');
        Assert.assertEquals('X', ticTacToe.getWinner());

    }



}
