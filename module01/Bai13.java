// Bài 13: In ra những số lẻ từ 1 đến 99
package module01;

public class Bai13 {

	public static void main(String[] args) {
		System.out.print("Những số lẻ từ 1 đến 99 là:");
		for (int i = 1; i <= 99; i++)
			if (i % 2 == 1)
				System.out.print(" " + i);
	}
}
