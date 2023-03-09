package bai05;

public class TestTamGiac {

	public static void main(String[] args) {
		/**
		 *  2 hình vi phạm ràng buộc
		 */
		TamGiac T1 = new TamGiac(8,4,4);
		TamGiac T2 = new TamGiac(-3,4,5);
		System.out.println(T1.tieuDe());
		System.out.println(T1.toString());
		System.out.println(T2.toString());
		
		/**
		 * 3 hình lần lượt là tam giác thường, cân, đều.
		 */
		TamGiac T3 = new TamGiac(3,5,7);
		TamGiac T4 = new TamGiac(5,5,7);
		TamGiac T5 = new TamGiac(5,5,5);
		System.out.println(T3.toString());
		System.out.println(T4.toString());
		System.out.println(T5.toString());
		
	}

}
