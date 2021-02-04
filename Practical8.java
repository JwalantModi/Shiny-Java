package Practicals;

import java.util.Scanner;

public class Practical8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = input.nextInt(),i=2;
		while(n!=1) {
			if(n%i==0) {
				n = n/i;
				System.out.print(i+" ");
			}else {
				i+=1;
			}
		}
		input.close();
	}

}
