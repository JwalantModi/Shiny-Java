package Practicals;
public class Practical2 {

	public static void main(String[] args) {
		System.out.println("1. 3.4x+50.2y=44.5 \n2. 2.1x+0.55y=5.9");
		double a = 3.4,b=50.2, c=2.1, d=0.55, e=44.5, f=5.9;
		double x = ((e*d)-(b*f))/((a*d)-(b*c)),y = ((a*f)-(e*c))/((a*d)-(b*c));
		System.out.println("Solution of Equations are: "+x+" and "+y);
	}

}