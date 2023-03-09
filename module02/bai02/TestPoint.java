package bai02;

public class TestPoint {

	public static void main(String[] args) {
		Point A = new Point(); 
		A.nhapThongTin();
		System.out.print("A");
		System.out.println(A); // Xuất tọa độ điểm A.
		System.out.print("Điểm đối xứng của A qua O là: ");
		A.negate();
		System.out.println(A);
		System.out.println("Khoảng cách từ điểm A đến gốc O là: " + A.getDistance());
	}
}
