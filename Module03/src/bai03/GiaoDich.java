package bai03;

import java.util.Date;

public class GiaoDich {
	private int maGiaoDich;
	private Date ngayGiaoDich;
	private double donGia;
	private int soLuong;
	private double thanhTien;

	public GiaoDich(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public final int getMaGiaoDich() {
		return maGiaoDich;
	}

	public final Date getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public final double getDonGia() {
		return donGia;
	}

	public final int getSoLuong() {
		return soLuong;
	}

	public final void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public final void setNgayGiaoDich(Date ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public final void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public final void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + "]";
	}

}
