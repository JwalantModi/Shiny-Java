package Practicals;

import java.util.Scanner;

public class Practical13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Valid Expression: ");
		String exp = input.nextLine();
		System.out.println("Given Expression is: " + exp);
		String []arr = exp.split("[\\+\\-\\*\\/]");
		double a = Double.parseDouble(arr[0]);
		double b = Double.parseDouble(arr[1]),ans = 0;
		char s = exp.charAt(arr[0].length());
		switch(s) {
		case '+':
			ans = a+b;
			break;
		case '-':
			ans = a-b;
			break;
		case '*':
			ans = a*b;
			break;
		case '/':
			ans = a/b;
			break;
		}
		System.out.println("Answer is: "+ans);
		input.close();
	}

}
