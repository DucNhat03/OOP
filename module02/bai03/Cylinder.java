package bai03;

import java.util.Scanner;

/**
 * 
 * Vẽ lược đồ lớp UML cho lớp hình trụ Cylinder: dữ liệu bao gồm bán kính và
 * chiều cao của hình trụ, các thao tác gồm tính diện tích xung quanh, diện tích
 * toàn phần và thể tích của hình trụ đó. Cài đặt lớp như thiết kế và tạo đối
 * tượng để kiểm tra lớp này
 *
 */
public class Cylinder {
	private float r;
	private float h;

	public Cylinder() {
		this(0, 0);
	}

	public Cylinder(float banKinh, float chieuCao) {

		setbanKinh(banKinh);
		setchieuCao(chieuCao);
	}

	public float getbanKinh() {
		return r;
	}

	public void setbanKinh(float banKinh) {
		if (banKinh > 0) {
			this.r = banKinh;
		} else {
			this.r = 0;
		}

	}

	public float getchieuCao() {
		return h;
	}

	public void setchieuCao(float chieuCao) {
		if (chieuCao > 0) {
			this.h = chieuCao;
		} else {
			this.h = 0;
		}
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập bán kính hình trụ: ");
		r = sc.nextFloat();
		System.out.print("Nhập chiều cao hình trụ: ");
		h = sc.nextFloat();

		setbanKinh(r);
		setchieuCao(h);

		sc.close();
	}

	public float tinhdtXQ() {
		return (float) (2 * 3.14 * r * h);
	}

	public float tinhdtTP() {
		return (float) (2 * 3.14 * r * r) + (tinhdtXQ());
	}

	public float tinhTheTich() {
		return (float) (r * r * 3.14 * h);
	}

	public String thongTin() {
		return String.format("%15s %15s %15s %15s %15s", "Bán kính", "Chiều cao", "dt Xung quanh", "dt Toàn phần", "Thể tích");
	}

	public String ketQua() {
		return String.format("%15.2f %15.2f %15.2f %15.2f %15.2f", r, h, tinhdtXQ(), tinhdtTP(), tinhTheTich());
	}

}
