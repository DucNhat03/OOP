package bai01;

import java.util.Scanner;

/**
 * Các thuộc tính: x, y và tên. Các phương thức set, get thông tin của x, y và
 * tên. Các phương thức khởi tạo: một constructor mặc định và một construtor đầy
 * đủ tham số. Phương thức getThongTin() trả về chuỗi thông tin theo mẫu:
 * tên(x,y)
 * 
 */
public class ToaDo {
	private String ten;
	private float x;
	private float y;

	public ToaDo() {
		this("O", 0, 0);
	}

	public ToaDo(String ten, float x, float y) {
		setTen(ten);
		setX(x);
		setY(y);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {

		if (ten.equals(" ")) {
			this.ten = "0";
		} else {
			this.ten = ten;
		}

	}

	public float getX() {
		return x;
	}

	public void setX(float x) {

		if (x > 0) {
			this.x = x;
		} else {
			this.x = 0;
		}

	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		if (y > 0) {
			this.y = y;
		} else {
			this.y = 0;
		}
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên tọa độ: ");
		ten = sc.nextLine();
		System.out.print("Nhập hoành độ: ");
		x = sc.nextFloat();
		System.out.print("Nhập tung độ: ");
		y = sc.nextFloat();

		setTen(ten);
		setX(x);
		setY(y);
		sc.close();
	}

	public String getThongTin() {
		return String.format("%s(%1.2f,%1.2f)", ten, x, y);
	}
}
