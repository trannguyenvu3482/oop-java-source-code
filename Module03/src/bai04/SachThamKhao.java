package bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SachThamKhao extends Sach {
	private double thue;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Locale local = new Locale("vi", "VN");
	NumberFormat nf = NumberFormat.getCurrencyInstance(local);

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
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

	@Override
	public String toString() {
		return String.format("%-10s|%-10s|%-10s|%-10s|%-20s|%-20s|%-10.2f|", super.getMaSach(),
				dtf.format(super.getNgayNhap()), nf.format(super.getDonGia()), super.getSoLuong(),
				super.getNhaXuatBan(), "", thue);
	}
}
