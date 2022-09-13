package bai02;

import java.util.Date;

public class SachThamKhao extends Sach {
	private double thue;

	public SachThamKhao(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	@Override
	public double getThanhTien() {
		return getSoLuong() * getDonGia() + thue;
	}

	public final double getThue() {
		return thue;
	}

	public final void setThue(double thue) {
		this.thue = thue;
	}

	public String toString() {
		super.toString();
		return "SachThamKhao [thue=" + thue + "]";
	}
}
