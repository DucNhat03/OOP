//Bài 07: Tính tổng các số nguyên tố nhỏ hơn N.
package module01;

import java.util.Scanner;

public class Bai07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int n = sc.nextInt();
		int tong = 0;
		for (int i = 2; i < n; i++)
			if (kiemtraSNT(i) == true)
				tong += i;
		System.out.println("Tổng các số nguyên tố nhỏ hơn " + n + " là: " + tong);
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
