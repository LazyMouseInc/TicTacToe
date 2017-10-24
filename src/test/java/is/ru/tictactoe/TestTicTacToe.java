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
	
}