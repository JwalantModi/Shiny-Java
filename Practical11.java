package Practicals;

public class Practical11 {

	public static void main(String[] args) {
		long[][] arr = new long[6][6];
		int i,j;;
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr[i].length-1;j++) {
				arr[i][j] = Random.randint(0, 1);
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		checkingRows(arr);
		checkingCols(arr);
		System.out.println();
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void checkingRows(long arr[][]) {
		int i,j,c;
		for(i=0;i<arr.length-1;i++) {
			c=0;
			for(j=0;j<arr[i].length-1;j++) {
				if(arr[i][j] == 1) {
					c+=1;
				}
			}
			if(c%2==0) {
				arr[i][arr.length-1] = 1;
			}
		}
	}
	public static void checkingCols(long arr[][]) {
		int i,j,c;
		for(i=0;i<arr.length;i++) {
			c=0;
			for(j=0;j<arr[i].length-1;j++) {
				if(arr[j][i] == 1) {
					c+=1;
				}
			}
			if(c%2==0) {
				arr[arr.length-1][i] = 1;
			}
			
		}
	}

}
