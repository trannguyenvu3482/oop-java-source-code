package bai02;

import java.util.Date;

public abstract class Sach {
	protected int maSach;
	protected Date ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	protected double thanhTien;

	public Sach(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getMaSach() {
		return maSach;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	@Override
	public String toString() {
		return "Sach [maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXuatBan=" + nhaXuatBan + ", thanhTien=" + thanhTien + "]";
	}
}
