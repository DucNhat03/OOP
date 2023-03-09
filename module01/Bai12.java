//Bài 12: In ra tổng của 10 số chẵn đầu tiên
package module01;

public class Bai12 {

	public static void main(String[] args) {
		int tong = 0;
		for (int i = 2; i <= 10; i++)
			if (i % 2 == 0)
				tong += i;
		System.out.println("Tổng của 10 số chẵn đầu tiên là: " + tong);
	}

}
