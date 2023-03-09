package bai06;

public class TestThongTinDangKyXe {

	public static void main(String[] args) {
		ThongTinDangKyXe O[] = new ThongTinDangKyXe[3];
		O[0] = new ThongTinDangKyXe("Nhật", "Sirius", 20000000, 125);
		O[1] = new ThongTinDangKyXe("Nhã", "Future Neo", 29000000, 130);
		O[2] = new ThongTinDangKyXe("Nhân", "Air Blade", 40000000, 155);
		System.out.println(O[0].tieuDe());
		System.out.println(O[0].xuatThongTin());
		System.out.println(O[1].xuatThongTin());
		System.out.println(O[2].xuatThongTin());
	}

}
