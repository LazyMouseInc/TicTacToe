package is.ru.tictactoe;
import java.util.Scanner;
public class TicTacToe{

	private static boolean gameOver = false;
	private static int turns = 0;
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

	private static void printArray(){
		System.out.println();
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(gameArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void turn() {
		Scanner sc = new Scanner(System.in);
		if(whoseTurn) {
			System.out.print("X, make a move: ");
			char input = sc.nextLine().charAt(0);
			setStatus(input);
		}
		else {
			System.out.print("O, make a move: ");
			char input = sc.nextLine().charAt(0);
			setStatus(input);
		}
	}

	public static void setStatus(char input) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(input == gameArr[i][j] && input != 'O' && input != 'X') {
					if(whoseTurn) {
						turns++;
						gameArr[i][j] = 'X';
						whoseTurn = !whoseTurn;
						checkIfWinner();
						return;
					}
					if(!whoseTurn) {
						turns++;
						gameArr[i][j] = 'O';
						whoseTurn = !whoseTurn;
						checkIfWinner();
						return;
					}
				}
			}
		}

		whoseTurn = !whoseTurn;
		throw new IllegalArgumentException("Please input a number that has not already been input.");
		
	}

	private static void checkIfWinner(){
		if(	gameArr[0][0] == gameArr[0][1] && gameArr[0][0] == gameArr[0][2] ||
			gameArr[1][0] == gameArr[1][1] && gameArr[1][0] == gameArr[1][2] ||
			gameArr[2][0] == gameArr[2][1] && gameArr[2][0] == gameArr[2][2] ||
			gameArr[0][0] == gameArr[1][0] && gameArr[0][0] == gameArr[2][0] ||
			gameArr[0][1] == gameArr[1][1] && gameArr[0][1] == gameArr[2][1] ||
			gameArr[0][2] == gameArr[1][2] && gameArr[0][2] == gameArr[2][2] ||
			gameArr[0][0] == gameArr[1][1] && gameArr[0][0] == gameArr[2][2] ||
			gameArr[2][0] == gameArr[1][1] && gameArr[2][0] == gameArr[0][2]	){

			gameOver = true;
			whoseTurn = !whoseTurn;

			if(whoseTurn){
				printArray();
				System.out.println("X is the winner!");
			}
			else if(!whoseTurn) {
				printArray();
				System.out.println("O is the winner!");
			}
			return;


		}
		if(turns == 9){
			gameOver = true;
			System.out.println("Tie!");
			return;
		} 

	}

	public static boolean isGameOver(){
		return gameOver;
	}

	public static boolean isTie(){
		return turns == 9;
	}

	public void play(){
		while(!gameOver) {
			try{
				printArray();
				turn();
			}
			catch(IllegalArgumentException ex){
				whoseTurn = !whoseTurn;
			}
		}
	}

	public static void main(String[] args){
		TicTacToe game = new TicTacToe();
		game.play();
	}
}