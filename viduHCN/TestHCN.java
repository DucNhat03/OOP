package viduHCN;

import java.util.Scanner;

public class TestHCN {
	public static void main(String[] args) {
		HinhChuNhat h1 = new HinhChuNhat();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		float cDai = sc.nextFloat();
		System.out.print("Nhập chiều rộng: ");
		float cRong = sc.nextFloat();
		h1 = new HinhChuNhat(cDai, cRong);
		System.out.println(h1.tieuDe());
		System.out.println(h1.layThongTin());
		sc.close();
	}

}
