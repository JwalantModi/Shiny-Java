package Practicals;

import java.util.Scanner;

public class Practical10 {

	public static void main(String[] args) {
		int i,t,n=10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter "+n+" Numbers: ");
		int arr[] = new int[n];
		for(i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		for(i=0;i<n/2;i++) {
			t = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = t;
		}
		System.out.print("After Reversing The All Numbers: ");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
