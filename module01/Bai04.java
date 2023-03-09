//Giải phương trình bậc nhất 1 ẩn. ax + b = 0 (a != 0)
package module01;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số a: ");
		a = sc.nextInt();
		System.out.print("Nhập vào số b: ");
		b = sc.nextInt();

		if (a == 0) {
			if (b == 0)
				System.out.println("Phương trình có vô số nghiệm");
			else
				System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.println("Phương trình có 1 nghiệm duy nhất: x = " + x);
		}
		sc.close();
	}
}
