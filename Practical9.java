package Practicals;

public class Practical9 {

	public static void main(String[] args) {
		int hcf = HCF(10,15);
		System.out.println(hcf);
	}
	public static int HCF(int a, int b) {
		int min = a<b?a:b;
		while(min>0) {
			if(a%min==0 && b%min==0) {
				return min;
			}
			min--;
		}
		
		return -1;
	}

}
