package Practicals;
import java.util.Random;
public class Practical12 {

	public static void main(String[] args) {
		Random random = new Random(1000);
		for(int i = 1; i <= 100; i++) {
			System.out.printf("%5d", random.nextInt(100)+1);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
