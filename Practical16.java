package Practicals;

import java.util.Scanner;

public class Practical16 {
	private static int num;
	private static int den;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Decimal Number: ");
		String str = input.nextLine();
		fraction(str);
		input.close();
	}
	public static void fraction(String s) {
		int n1 = s.indexOf("."), len, n2;
		int n,k,gcd;
		len = s.length()-1;
		n2 = len-n1;
		k = point(n2);
		n = (int) (Double.parseDouble(s) * k);
		gcd = GCD(n,k);
		num = n/gcd;
		den = k/gcd;
		System.out.println(num+" / "+den);
//		System.out.println(Double.parseDouble(s));
//		for(i=1;i<=n;i++) {
//			for(j=1;j<=k;j++) {
//				if((i/j) == Double.parseDouble(s)) {
//					System.out.println((int)i+" / "+(int)j);
//					break;
//				}
//			}
//			if(j<=k) {
//				break;
//			}
//		}
	}
	public static int point(int n) {
		return (int) Math.pow(10, n);
	}
	public static int GCD(int x, int y) {
		int min = Math.min(x, y),i;
		for (i=min;i >= 1;i--) {
			if(x%i==0 && y%i==0) {
				return i;
			}
		}
		return -1;
	}
}
