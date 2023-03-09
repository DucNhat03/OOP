// Bài 16: Nhập 1 số và in ra đó là số chẵn, số lẻ hay 0
package module01;

import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập 1 giá trị nguyên từ bàn phím: ");
		int n = sc.nextInt();
		if (n == 0)
			System.out.print(n + " là số 0");
		else if (n % 2 == 0)
			System.out.print(n + " là số chẵn");
		else
			System.out.print(n + " là số lẻ");
		sc.close();
	}
}
