package bai02;

import java.util.Scanner;

/**
 * Vẽ lược đồ lớp UML cho lớp Point để tạo ra đối tượng điểm trong không gian
 * hai chiều. Biết lớp chứa một constructor mặc định, một constructor có đủ tham
 * số, một hàm negate() để biến đổi điểm thành một điểm đối xứng qua gốc O, một
 * hàm getDistance() trả về khoảng cách từ gốc O và một hàm toString() trả về
 * thông tin toạ độ
 */
public class Point {
	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int dx, int dy) {
		setX(dx);
		setY(dy);
	}

	public int getX() {
		return x;
	}

	public void setX(int X) {
		if (X > 0) {
			this.x = X;
		} else {
			this.x = 0;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int Y) {
		if (Y > 0) {
			this.y = Y;
		} else {
			this.y = 0;
		}
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hoành độ x: ");
		x = sc.nextInt();
		System.out.print("Nhập tung độ y: ");
		y = sc.nextInt();
		sc.close();
	}

	// Hàm tìm điểm đối xứng qua tâm O.
	public void negate() {
		this.x = -getX();
		this.y = -getY();
	}

	/**
	 * Hàm tính khoảng cách. Vì hàm Math.sqrt(): trả về double. Ép kiểu về float.
	 */
	public float getDistance() {
		return (float) Math.sqrt(x * x + y * y);
	}

	public String toString() {
		return String.format("(" + x + "," + y + ")");
	}

}
