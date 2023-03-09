//Bài 08: Tính tổng N số nguyên tố đầu tiên.
package module01;

import java.util.Scanner;

public class Bai08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		int tong = 0, i = 2, m = n;
		while (m > 0) {
			if (kiemtraSNT(i)) {
				tong += i;
				m--;
			}
			i++;
		}
		System.out.print("Tổng " + n + " số nguyên tố đầu tiên là " + tong);
		sc.close();
	}

	public static boolean kiemtraSNT(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
