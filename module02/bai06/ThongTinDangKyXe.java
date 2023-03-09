package bai06;

public class ThongTinDangKyXe {
	private String tenChuXe;
	private String loaiXe;
	private float triGiaXe;
	private float dungTich;

	public ThongTinDangKyXe() {
		this("0", "0", 0, 0);
	}

	public ThongTinDangKyXe(String ten, String loai, float tGia, float dTich) {
		setTenChuXe(ten);
		setLoaiXe(loai);
		setTriGiaXe(tGia);
		setDungTich(dTich);
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String ten) {
		if (ten.equals("")) {
			this.tenChuXe = "0";
		} else {
			this.tenChuXe = ten;
		}
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loai) {
		if (loai.equals("")) {
			this.loaiXe = "0";
		} else {
			this.loaiXe = loai;
		}

	}

	public float getTriGiaXe() {
		return triGiaXe;
	}

	public void setTriGiaXe(float tGia) {
		if (tGia > 0) {
			this.triGiaXe = tGia;
		} else {
			this.triGiaXe = 0;
		}

	}

	public float getDungTich() {
		return dungTich;
	}

	public void setDungTich(float dTich) {
		if (dTich > 0) {
			this.dungTich = dTich;
		} else {
			this.dungTich = 0;
		}
	}

	public float tinhThuePhaiNop() {
		if (this.dungTich <= 100) {
			return (float) this.triGiaXe * 1 / 100;
		} else if (this.dungTich >= 100 && this.dungTich <= 200) {
			return (float) this.triGiaXe * 3 / 100;
		} else
			return (float) this.triGiaXe * 5 / 100;

	}

	public String tieuDe() {
		return String.format("%-15s %-15s %-15s %-15s %-15s", "Tên chủ xe", "Loại xe", "Trị giá xe", "Dung tích",
				"Thuế phải nộp");
	}

	public String xuatThongTin() {
		return String.format("%-15s %-15s %-15.2f %-15.2f %-15.2f", tenChuXe, loaiXe, triGiaXe, dungTich,
				tinhThuePhaiNop());
	}

}
