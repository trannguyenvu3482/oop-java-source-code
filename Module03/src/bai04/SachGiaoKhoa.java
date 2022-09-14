package bai04;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double getThanhTien() {
		if (tinhTrang) {
			return getSoLuong() * getDonGia();
		} else {
			return getSoLuong() * getDonGia() * 0.5;
		}
	}

	public String toString() {
		super.toString();
		return "SachGiaoKhoa [tinhTrang=" + tinhTrang + "]";
	}

}
