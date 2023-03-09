//Viết chương trình tìm USCLN của 2 số nhập vào
package module01;

import java.util.Scanner;

public class Bai05 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số a: ");
		a = sc.nextInt();
		System.out.print("Nhập số b: ");
		b = sc.nextInt();

		int x = gcd1(a, b);
		System.out.println("USCLN của a và b là: " + x);
		sc.close();
	}

	static int gcd1(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b; // a = a- b
			} else {
				b -= a; // b = b - a
			}
		}
		return a;
	}
}
