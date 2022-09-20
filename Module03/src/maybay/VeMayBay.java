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

	public VeMayBay(String ma, String noiDi, String noiDen, LocalDate ngayBay, double giaTien) throws Exception {
		if (ma.length() == 3) {
			this.ma = ma;
		} else {
			throw new Exception("Ma phai co 3 ki tu");
		}

		if (noiDi.length() > 0) {
			this.noiDi = noiDi;
		} else {
			throw new Exception("Chuoi phai khac rong");
		}

		if (noiDen.length() > 0) {
			this.noiDen = noiDen;
		} else {
			throw new Exception("Chuoi phai khac rong");
		}

		if (ngayBay.isAfter(LocalDate.now())) {
			this.ngayBay = ngayBay;
		} else {
			throw new Exception("Ngay bay phai sau ngay hom nay");
		}

		if (giaTien >= 0) {
			this.giaTien = giaTien;
		} else {
			throw new Exception("Gia tien phai >= 0");
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

	public void setMa(String ma) throws Exception {
		if (ma.length() == 3) {
			this.ma = ma;
		} else {
			throw new Exception("Ma phai co 3 ki tu");
		}
	}

	public void setNoiDi(String noiDi) throws Exception {
		if (noiDi.length() > 0) {
			this.noiDi = noiDi;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
	}

	public void setNoiDen(String noiDen) throws Exception {
		if (noiDen.length() > 0) {
			this.noiDen = noiDen;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
	}

	public void setNgayBay(LocalDate ngayBay) throws Exception {
		if (ngayBay.isAfter(LocalDate.now())) {
			this.ngayBay = ngayBay;
		} else {
			throw new Exception("Ngay bay phai sau ngay hom nay");
		}
	}

	public void setGiaTien(double giaTien) throws Exception {
		if (giaTien >= 0) {
			this.giaTien = giaTien;
		} else {
			throw new Exception("Gia tien phai >= 0");
		}
	}

	@Override
	public String toString() {
		return String.format("%-20s|%-20s|%-20s|%-10s|", ma, getTenChuyen(), dtf.format(ngayBay), nf.format(giaTien));
	}
}
