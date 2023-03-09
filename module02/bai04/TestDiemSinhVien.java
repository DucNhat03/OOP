package bai04;

public class TestDiemSinhVien {

	public static void main(String[] args) {

		/**
		 * Tao sv1 và sv2 bằng constructer mặc định và constructer đầy đủ tham số.
		 */
		DiemSinhVien sv1 = new DiemSinhVien();
		DiemSinhVien sv2 = new DiemSinhVien(12, "Nguyen Duc Nhat", 7.5f, 8.5f);
		/**
		 * Tạo sv3 bằng constructer đủ tham số. Nhập thông tin từ bàn phím.
		 */
		DiemSinhVien sv3 = new DiemSinhVien();
		sv3.nhapThongTin();
		
		System.out.println(sv1.tieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);

	}
}
