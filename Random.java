package Practicals;
public class Random{
	private static int a;
	private static int b;
	public static int randint(int a1, int b1) {
		a = a1;
		b = b1+1;
		int n;
		n = a+(int)(Math.random()*(b-a));
		return n;
	}
}