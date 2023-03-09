package bai05;

/**
 * a. Vẽ lược đồ và cài đặt lớp hình tam giác, có 3 cạnh ma, mb, mc, viết các phương thức:
 * Constructor mặc định (không tham số). 
 * Constructor đủ tham số.
 * Các phương thức getter/setter
 * - Phương thức tính chu vi, tính diện tích. 
 * - Phương thức trả về thông tin kiểu tam giác.
 *  - Phương thức toString để diễn tả đối tượng ở dạng chuỗi gồm: thông tin 3 cạnh, kiểu tam giác, chu vi, diện tích. 
 * b. Viết hàm main tạo 5 hình tam giác, trong đó: 2 hình vi phạm ràng buộc, 3 hình lần lượt là tam giác thường, cân, đều. 
 * Xuất thông tin các hình này theo dạng bảng. Sửa số đo 1 cạnh của tam giác bất kỳ.
 *
 */
public class TamGiac {
	private float ma;
	private float mb;
	private float mc;

	public TamGiac() {
		this(0, 0, 0);
	}

	public TamGiac(float a, float b, float c) {
		setma(a);
		setmb(b);
		setmc(c);
	}

	public float getma() {
		return ma;
	}

	public void setma(float ma) {
		if (ma > 0) {
			this.ma = ma;
		} else {
			this.ma = 0;
		}

	}

	public float getmb() {
		return mb;
	}

	public void setmb(float mb) {
		if (mb > 0) {
			this.mb = mb;
		} else {
			this.mb = 0;
		}
	}

	public float getmc() {
		return mc;
	}

	public void setmc(float mc) {
		if (mc > 0) {
			this.mc = mc;
		} else {
			this.mc = 0;
		}
	}

	public String kiemTraTamGiac() {
		if (ma < mb + mc && mb < ma + mc && mc < mb + ma) {
			if (ma == mb && mb == mc) {
				return "Tam giác đều!";
			} else if (ma == mb && mb != mc || mb == mc && mc != ma || mc == ma && ma != mb) {
				return "Tam giác cân!";
			} else if (ma * ma + mb * mb == mc * mc || mb * mb + mc * mc == ma * ma || ma * mc + mc * mc == mb * mb) {
				return "Tam giác vuông!";
			} else if (ma == mb && mb != mc && 2 * ma * ma == mc * mc || mb == mc && mc != ma && 2 * mb * mb == ma * ma
					|| mc == ma && ma != mb && 2 * mc * mc == mb * mb) {
				return "Tam giác vuông cân!";
			} else {
				return "Tam giác thường!";
			}
		} else {
			return "Không phải tam giác!";
		}
	}

	public float tinhChuvi() {
		return (ma + mb + mc) / 2;
	}

	public float tinhDienTich() {
		float p = tinhChuvi();
		return (float) Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	public String tieuDe() {
		return String.format("%-10s %-10s %-10s %-15s %-15s %-15s", "cạnh ma", "cạnh mb", "cạnh mc", "Chu vi", "Diện tích", "Loại TG");
	}

	public String toString() {
		return String.format("%-10.2f %-10.2f %-10.2f %-15.2f %-15.2f %-15s", ma, mb, mc, tinhChuvi(), tinhDienTich(), kiemTraTamGiac());
	}
}
