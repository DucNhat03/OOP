//Bài 10: Tách chuỗi gốc thành chuỗi con.
package module01;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi ký tự: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == ' ')
				System.out.println();
			else
				System.out.print(s.charAt(i));
		sc.close();
	}
}
