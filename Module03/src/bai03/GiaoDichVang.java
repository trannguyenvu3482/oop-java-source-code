package bai03;

import java.util.Date;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	public GiaoDichVang(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public final String getLoaiVang() {
		return loaiVang;
	}

	public final void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	@Override
	public double getThanhTien() {
		return this.getSoLuong() * this.getDonGia();
	}

	@Override
	public String toString() {
		return "GiaoDichVang [loaiVang=" + loaiVang + super.toString() + "]";
	}

}
