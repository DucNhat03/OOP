//Bài 09: Viết chương trình in ra số lần kí tự 'a' xuất hiện trong 1 chuỗi.
package module01;

import java.util.Scanner;

public class Bai09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi ký tự: ");
		String s = sc.nextLine();
		int dem = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'a')
				dem++;
		System.out.println("Kí tự 'a' xuất hiện " + dem + " lần trong chuỗi");
		sc.close();
	}
}
