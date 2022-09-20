package bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Locale local = new Locale("vi", "VN");
	NumberFormat nf = NumberFormat.getCurrencyInstance(local);

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

	@Override
	public String toString() {
		return String.format("%-10s|%-10s|%-10s|%-10s|%-20s|%-20s|%-10s|", super.getMaSach(),
				dtf.format(super.getNgayNhap()), nf.format(super.getDonGia()), super.getSoLuong(),
				super.getNhaXuatBan(), tinhTrang == true ? "Moi" : "Cu", "");
	}
}
