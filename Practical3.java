package Practicals;
import java.util.Scanner;
public class Practical3 {
	public static void main(String [] args) {
		System.out.println("Enter the value in meters: ");
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double feet = n*3.28084;
		System.out.println("The value in Feet: "+feet);
		input.close();
	}
}
