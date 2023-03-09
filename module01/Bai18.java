// Bài 18: Xuất ra màn hình n số Fibonaci đầu tiên với 2 giá trị đầu là 1
package module01;

import java.util.Scanner;

public class Bai18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		System.out.print(n + " số Fibonaci đầu tiên là: ");
		int f1 = 1, f2 = 1, fn;
		for (int i = 1; i <= n; i++) {
			System.out.print(f1 + " ");
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		sc.close();
	}

}
