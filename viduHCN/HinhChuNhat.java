package viduHCN;

public class HinhChuNhat {
	float cDai, cRong;

	public HinhChuNhat() {
	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		cDai = chieuDai;
		cRong = chieuRong;
	}

	public float getChieuDai() {
		return cDai;
	}

	public void setChieuDai(float chieuDai) {
		this.cDai = chieuDai;
	}

	public float getChieuRong() {
		return cRong;
	}

	public void setChieuRong(float chieuRong) {
		this.cRong = chieuRong;
	}

	public float tinhChuVi() {
		return (cDai + cRong) * 2;
	}

	public float tinhDienTich() {
		return cDai * cRong;
	}

	public String tieuDe() {
		return String.format("%15s %15s %15s %15s ", "Dai", "Rong", "Chu Vi", "Dien Tich");
	}

	public String layThongTin() {
		return String.format("%15.2f %15.2f %15.2f %15.2f ", cDai, cRong, tinhChuVi(), tinhDienTich());
	}

}
