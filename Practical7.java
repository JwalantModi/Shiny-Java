package Practicals;

import LogicGames.Random;

public class Practical7 {

	public static void main(String[] args) {
		String code_name = ""+(char)Random.randint(65, 90);
		code_name += (char)Random.randint(65, 90);
		code_name += (char)Random.randint(65, 90);
		for(int i = 0;i<4;i++) {
			code_name += Random.randint(0, 9);
		}
		System.out.println(code_name);
	}

}
