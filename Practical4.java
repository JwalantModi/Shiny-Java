package Practicals;
import java.util.Scanner;
public class Practical4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Height in inches and Weight in pound: ");
		double height = input.nextInt(),weight = input.nextInt();
		final double kg = 0.45359237, meter = 0.0254;
		double act1 = height*meter, act2 = weight*kg;
		double bmi1 = act2/(act1*act1);
		System.out.println("BMI: "+bmi1);
		input.close();
	}

}
