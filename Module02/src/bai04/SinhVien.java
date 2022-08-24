package bai04;

public class SinhVien {
	// Attributes
	private int maSinhVien;
	private String hoTen;
	private double diemLT;
	private double diemTH;

	// Default Constructor
	public SinhVien() {
		this.maSinhVien = 111111;
		this.hoTen = "Nguyen Van A";
		this.diemLT = 0.0;
		this.diemTH = 0.0;
	}

	// Parameters Constructor
	public SinhVien(int maSinhVien, String hoTen, double diemLT, double diemTH) {
		// Set Parameters
		setMaSinhVien(maSinhVien);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	// Getters and Setters
	public int getMaSinhVien() {
		return maSinhVien;
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

	public void setMaSinhVien(int maSinhVien) {
		if (maSinhVien > 0) {
			this.maSinhVien = maSinhVien;
		} else {
			this.maSinhVien = 0;
		}
	}

	public void setHoTen(String hoTen) {
		if (hoTen != "" || hoTen.length() > 0) {
			this.hoTen = hoTen;
		} else {
			this.hoTen = "Nguyen Van A";
		}
	}

	public void setDiemLT(double diemLT) {
		if (diemLT > 0) {
			this.diemLT = diemLT;
		} else {
			this.diemLT = 0.0;
		}
	}

	public void setDiemTH(double diemTH) {
		if (diemTH > 0) {
			this.diemTH = diemTH;
		} else {
			this.diemTH = 0.0;
		}
	}

	// Calculate avg
	public double average() {
		return (diemLT + diemTH) / 2;
	}

	// toString method
	@Override
	public String toString() {
		return String.format("%-10s %-30s %-10.2f %-10.2f %-10.2f", maSinhVien, hoTen, diemLT, diemTH, average());
	}
}
