package is.ru.tictactoe;

public class TicTacToe{

	private static boolean gameOver = false;
	private static boolean whoseTurn = true;
	private static char [][] gameArr;

	public TicTacToe(){
		gameArr = new char [3][3];
		gameArr[0][0] = '1';
		gameArr[0][1] = '2';
		gameArr[0][2] = '3';
		gameArr[1][0] = '4';
		gameArr[1][1] = '5';
		gameArr[1][2] = '6';
		gameArr[2][0] = '7';
		gameArr[2][1] = '8';
		gameArr[2][2] = '9';
	}
	
	public static char getStatus(int row, int col){
		return gameArr[row][col];
	}
}