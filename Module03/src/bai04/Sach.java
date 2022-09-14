package bai04;

import java.time.LocalDate;

public class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public final String getMaSach() {
		return maSach;
	}

	public final LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public final double getDonGia() {
		return donGia;
	}

	public final int getSoLuong() {
		return soLuong;
	}

	public final String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public final void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public final void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public final void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public final void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public final void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public double getThanhTien() {
		return 0;
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXuatBan=" + nhaXuatBan + "]";
	}

}
