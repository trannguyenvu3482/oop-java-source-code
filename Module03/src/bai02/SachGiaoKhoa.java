package bai02;

import java.util.Date;

public class SachGiaoKhoa extends Sach {
	private String tinhTrang;

	public SachGiaoKhoa(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double getThanhTien() {
		if (tinhTrang == "moi") {
			return getSoLuong() * getDonGia();
		} else if (tinhTrang == "cu") {
			return getSoLuong() * getDonGia() * 0.5;
		} else {
			System.out.println("Khong hop le!");
			return 0;
		}
	}

	public final String getTinhTrang() {
		return tinhTrang;
	}

	public final void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String toString() {
		super.toString();
		return "SachGiaoKhoa [tinhTrang=" + tinhTrang + "]";
	}

}
