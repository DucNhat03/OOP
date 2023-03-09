package bai04;

import java.util.Scanner;

/**
 * Viết lớp đối tượng DiemSinhVien như sau: 
 * Các thuộc tính: Mã sinh viên (số nguyên>0), Họ tên (chuỗi, không được rỗng), Điểm LT, điểm TH (số thực, thuộc [0.0,10.0]). 
 * Các phương thức: Constructor mặc định (gán giá trị mặc định)
 * Constructor nhận đầy đủ thông tin.
 * instance Các getter và setter cho mỗi thuộc tính Tính điểm trung bình (trung bình=(điểm LT + điểm TH)/2) 
 * Phương thức toString diễn tả đối tượng ở dạng chuỗi gồm 4 thông tin là mã sinh viên, họ tên, điểm LT, điểm TH, điểm TB.
 * b. Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
 * sv1, sv2 từ constructer mặc định và đầy đủ tham số. sv3 nhập từ bàn phím.
 */
public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT, diemTH;

	public DiemSinhVien() {
		this(52, "Nguyen Van A", 6, 7);
	}

	public DiemSinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if (maSV > 0) {
			this.maSV = maSV;
		} else {
			this.maSV = 0;
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen.equals(" ")) {
			this.hoTen = "Null";
		} else {
			this.hoTen = hoTen;
		}
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		if (diemLT >= 0 && diemLT <= 10) {
			this.diemLT = diemLT;
		} else {
			this.diemLT = 0;
		}
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		if (diemTH >= 0 && diemTH <= 10) {
			this.diemTH = diemTH;
		} else {
			this.diemTH = 0;
		}
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập mã sinh viên cho sinh viên: ");
		maSV = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập họ và tên cho sinh viên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập điểm lí thuyết cho sinh viên: ");
		diemLT = sc.nextFloat();
		System.out.print("Nhập điểm thực hành cho sinh viên: ");
		diemTH = sc.nextFloat();

		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);

		sc.close();
	}

	public float tinhDiemTB() {
		return (diemLT + diemTH) / 2;
	}

	public String tieuDe() {
		return String.format("%-20s %-20s %10s %10s %10s", "Ma SV", "HoTen", "DiemLT", "DiemTH", "DiemTB");
	}

	public String toString() {
		return String.format("%-20d %-20S %10.2f %10.2f %10.2f", maSV, hoTen, diemLT, diemTH, tinhDiemTB());
	}

}
