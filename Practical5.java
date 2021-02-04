package Practicals;
import java.util.Scanner;
public class Practical5 {

	public static void main(String[] args) {
		int i,j,t,c=0;
		int arr[] = new int[3];
		System.out.println("Enter 3 Numbers: ");
		Scanner input = new Scanner(System.in);
		for(i=0;i<3;i++) {
			arr[i] = input.nextInt();
		}
		
		for(i=0;i<3-1;i++) {
			for(j=0;j<3-1-i;j++) {
				if(arr[j] < arr[j+1]) {
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					c=1;
				}
			}
			if (c==0) {
				break;
			}
		}
		for(i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
