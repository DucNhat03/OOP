//Viết chương trình in ra tổng 1+3+5+...n nếu n là số chẵn, 2+4+6+...n nếu n là số lẻ. 
package module01;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị n: ");
		int n = sc.nextInt(); // Giả sử n là số chẵn
		int S = tinhTong(n);
		System.out.println("Tong: " + S);

		sc.close();
	}

	static int tinhTong(int n) {
		int S = 0;
		for (int i = 1; i <= n; i++) {
			if (n % 2 == 0) // Nếu N là số chẵn
			{
				if (i % 2 != 0) // Kiếm tra các số lẻ.
					S += i; // Tổng S= 1+3+5+...n
			} else // Nếu N là số lẻ
			{
				if (i % 2 == 0) // Kiểm tra các số chẵn.
					S += i; // Tổng S= 2+4+6+...n
			}
		}
		return S;
	}
}
