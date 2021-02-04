package Practicals;
import java.util.Scanner;
public class Practical6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = input.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':	
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It's a Vowel");
			break;
		default:
			System.out.println("It's a Consonant");
			break;
		}
		input.close();
	}

}
