package Practicals;

import java.util.ArrayList;
import java.util.Scanner;

public class Practical17 {
	static char board [][];
	static ArrayList<String> arr = new ArrayList();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name[] = new String[2];
		board = new char[3][3];
		System.out.print("Enter First Player Name: ");
		name[0] = input.next();
		System.out.print("\nEnter Second Player Name: ");
		name[1] = input.next();
		System.out.println();
		System.out.println("Player "+name[0]+" - (O)");
		System.out.println("Player "+name[1]+" - (X)\n");
		printBoard(board);
		int r,c,r1,c1;
		String n;
		while(true) {
			System.out.print("\nPlayer 1 - O");
			System.out.print("\nEnter row and column (1,2,3): ");
			r = input.nextInt();
			c = input.nextInt();
			while(r <= 0 || r > 3 || c <= 0 || c > 3 || arr.contains(""+r+c)) {
				System.out.println("Enter valid row and column number (1,2,3): ");
				r = input.nextInt();
				c = input.nextInt();
			}
			n = ""+r+c;
//			System.out.println(n);
			arr.add(n);
			board[r-1][c-1] = 'O';
			if(winner('O')) {
				printBoard(board);
				System.out.println("\nPlayer 1 "+name[0]+" Wins!");
				break;
			}else if(tie()){
				printBoard(board);
				System.out.println("\nMatch Ties!");
				break;
			}else {
				printBoard(board);
			}
			
			System.out.print("\nPlayer 2 - X");
			System.out.print("\nEnter row and column (1,2,3): ");
			r1 = input.nextInt();
			c1 = input.nextInt();
			while(r1 <= 0 || r1 > 3 || c1 <= 0 || c1 > 3 || arr.contains(""+r1+c1)) {
				System.out.println("Enter valid row and column number (1,2,3): ");
				r1 = input.nextInt();
				c1 = input.nextInt();
			}
			n = ""+r1+c1;
			arr.add(n);
			board[r1-1][c1-1] = 'X';
			if(winner('X')) {
				printBoard(board);
				System.out.println("\nPlayer 2 "+name[1]+" Wins!");
				break;
			}
			else if(tie()){
				printBoard(board);
				System.out.println("\nMatch Ties!");
				break;
			}
			else{
				printBoard(board);
			}
		}
		input.close();

	}
	public static void printBoard(char board[][]) {
		int i,j;
		for(i=0;i<board.length;i++) {
			for(j=0;j<board[i].length;j++) {
				System.out.print(" "+board[i][j]);
				if(j<2) {
					System.out.print(" |");
				}
			}
			if(i<2) {
				System.out.println();
				System.out.println("---+---+---");
			}
		}
	}
	public static boolean winner(char ch) {
		return (board[0][0] == ch && board[0][1] == ch && board[0][2] == ch ||
				board[1][0] == ch && board[1][1] == ch && board[1][2] == ch ||
				board[2][0] == ch && board[2][1] == ch && board[2][2] == ch ||
				board[0][0] == ch && board[1][0] == ch && board[2][0] == ch ||
				board[0][1] == ch && board[1][1] == ch && board[2][2] == ch ||
				board[0][2] == ch && board[1][2] == ch && board[2][2] == ch ||
				board[0][0] == ch && board[1][1] == ch && board[2][2] == ch ||
				board[0][2] == ch && board[1][1] == ch && board[2][0] == ch);
	}
	public static boolean tie() {
		return (board[0][0] != '\0' && board[0][1] != '\0' && board[0][2] != '\0' &&
				board[1][0] != '\0' && board[1][1] != '\0' && board[1][2] != '\0' &&
				board[2][0] != '\0' && board[2][1] != '\0' && board[2][2] != '\0' &&
				board[0][0] != '\0' && board[1][0] != '\0' && board[2][0] != '\0' &&
				board[0][1] != '\0' && board[1][1] != '\0' && board[2][2] != '\0' &&
				board[0][2] != '\0' && board[1][2] != '\0' && board[2][2] != '\0' &&
				board[0][0] != '\0' && board[1][1] != '\0' && board[2][2] != '\0' &&
				board[0][2] != '\0' && board[1][1] != '\0' && board[2][0] != '\0');
	}

}
