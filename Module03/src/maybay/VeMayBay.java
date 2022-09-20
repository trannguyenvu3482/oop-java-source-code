package maybay;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class VeMayBay {
	private String ma;
	private String noiDi;
	private String noiDen;
	private LocalDate ngayBay;
	private double giaTien;

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Locale local = new Locale("vi", "VN");
	NumberFormat nf = NumberFormat.getCurrencyInstance(local);

	public VeMayBay(String ma, String noiDi, String noiDen, LocalDate ngayBay, double giaTien) {
		if (ma.length() == 3) {
			this.ma = ma;
		}

		if (noiDi.length() > 0) {
			this.noiDi = noiDi;
		}

		if (noiDen.length() > 0) {
			this.noiDen = noiDen;
		}

		if (ngayBay.isAfter(LocalDate.now())) {
			this.ngayBay = ngayBay;
		}

		if (giaTien >= 0) {
			this.giaTien = giaTien;
		}
	}

	private String getTenChuyen() {
		return noiDi + "-" + noiDen;
	}

	public String getMa() {
		return ma;
	}

	public String getNoiDi() {
		return noiDi;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public LocalDate getNgayBay() {
		return ngayBay;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setMa(String ma) {
		if (ma.length() == 3) {
			this.ma = ma;
		}
	}

	public void setNoiDi(String noiDi) {
		if (noiDi.length() > 0) {
			this.noiDi = noiDi;
		}
	}

	public void setNoiDen(String noiDen) {
		if (noiDen.length() > 0) {
			this.noiDen = noiDen;
		}
	}

	public void setNgayBay(LocalDate ngayBay) {
		if (ngayBay.isAfter(LocalDate.now())) {
			this.ngayBay = ngayBay;
		}
	}

	public void setGiaTien(double giaTien) {
		if (giaTien >= 0) {
			this.giaTien = giaTien;
		}
	}

	@Override
	public String toString() {
		return String.format("%-20s|%-20s|%-20s|%-10s|", ma, getTenChuyen(), dtf.format(ngayBay), nf.format(giaTien));
	}
}
