package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTicTacToe{
	@Test
	public void testArrayIndex(){
		TicTacToe ttt = new TicTacToe();
		assertEquals('1', ttt.getStatus(0, 0));
		assertEquals('2', ttt.getStatus(0, 1));
		assertEquals('3', ttt.getStatus(0, 2));
		assertEquals('9', ttt.getStatus(2, 2));
		assertEquals('5', ttt.getStatus(1, 1));
	}

	@Test
	public void testTurn(){
		TicTacToe ttt = new TicTacToe();
		ttt.setStatus('1');
		ttt.setStatus('9');

		assertEquals('X', ttt.getStatus(0,0));
		assertEquals('O', ttt.getStatus(2,2));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testIllegalInput(){
		TicTacToe ttt = new TicTacToe();

		ttt.setStatus('1');
		ttt.setStatus('1');
	}
	
}