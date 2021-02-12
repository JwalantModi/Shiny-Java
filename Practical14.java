package Practicals;

import java.util.ArrayList;
import java.util.Date;

class Loan{
	private double bal;
	private String name;
	private int age;
	public Loan(double b, String n, int a) {
		bal = b;
		name = n;
		age = a;
	}
	public double getBalance() {
		return bal;
	}
	public String toString() {
		String s = "Loan Details: Balance is: "+bal+"\n Name is: "+name+"\n Age is: "+age+"\n";
		return s;
	}
}
class Circle{
	private double radius;
	public Circle(double b) {
		radius = b;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public String toString() {
		String s = "Circle Details: Radius is: "+radius+"\n Area is: "+getArea();
		return s+"\n";
	}
}
public class Practical14 {

	public static void main(String[] args) {
		ArrayList<Object>list = new ArrayList<Object>();
		Loan l1 = new Loan(1000, "abc", 21);
		list.add(l1);
		Circle c1 = new Circle(10);
		list.add(c1);
		Date d1 = new Date();
		list.add(d1);
		String s = new String("\nHello World\n");
		list.add(s);
		for (Object i: list) {
			System.out.println(i.toString());
		}
	}

}
