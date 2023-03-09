package module01;

import java.util.Random;

public class RandomExercise {
	public static void main(String[] args) {
//		Random rd = new Random();
//		int n = rd.nextInt();
//		System.out.println("Number: "+ n);
		int min = 6;
		int max = 100;
		Random r = new Random();
		int i1 = r.nextInt(max - min +1) +min;
		System.out.println("Number: "+ i1);
	}
}
