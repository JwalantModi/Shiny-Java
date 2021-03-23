package Practicals;

import java.util.Scanner;

public class Practical15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Binary Number: ");
		String s = input.nextLine();
		int n = bin2Dec(s);
		System.out.println(n);
		input.close();
	}
	public static int bin2Dec(String str) {
		int result = 0,i;
		char ch;
		for(i=0;i<str.length();i++) {
			ch = str.charAt(str.length()-i-1);
			if(ch != '0' && ch != '1') {
				throw new NumberFormatException("Given Number is not a binary number: "+str);
			}
			else if(ch == '1') {
				result = result + (int)Math.pow(2, i);
			}
		}
		return result;
	}
}
