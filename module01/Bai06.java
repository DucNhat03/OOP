//Viết chương trình kiểm tra số nhập vào phải số nguyên tố không???
package module01;

import java.util.Scanner;

public class Bai06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập 1 số nguyên cần kiểm tra: ");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println("Là số nguyên tố.");
		else
			System.out.println("Không phải số nguyên tố.");
		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
