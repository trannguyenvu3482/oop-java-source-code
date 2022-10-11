package tranNguyenVu_21082801;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private double diemLT, diemTH;

	public SinhVien() {

	}

	public SinhVien(String maSV, String hoTen, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public String getMaSV() {
		return maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getDiemLT() {
		return diemLT;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}

	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
	}
}
