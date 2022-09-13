package bai02;

import java.util.Date;

public class SachGiaoKhoa extends Sach {
	private String tinhTrang;

	public SachGiaoKhoa(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	public void calcThanhTien() {
		if (tinhTrang == "moi") {
			setThanhTien(getSoLuong() * getDonGia());
		} else if (tinhTrang == "cu") {
			setThanhTien(getSoLuong() * getDonGia() * 0.5);
		} else {
			System.out.println("Khong hop le!");
		}
	}

	public final String getTinhTrang() {
		return tinhTrang;
	}

	public final void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}
