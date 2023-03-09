// Bài 17: Xuất ra những số là bội số của 3 từ 3 đến 300
package module01;

public class Bai17 {

	public static void main(String[] args) {
		System.out.print("Những số là bội số của 3 từ 3 đến 300 là: ");
		int i = 3;
		while (i <= 300) {
			System.out.print(" " + i);
			i += 3;
		}
	}

}
