package bai06;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong;
	protected String dayNha;
	protected double dienTich;
	protected int soBongDen;

	public String getMaPhong() {
		return maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}

	protected abstract boolean checkDatChuan();
}
