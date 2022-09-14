package bai12;

import java.text.NumberFormat;
import java.util.Locale;

public class CD {
	private int maCd;
	private String tuaCd;
	private int soBaiHat;
	private double giaThanh;

	public CD() {
		this.maCd = 999999;
		this.tuaCd = "Chua xac dinh";
	}

	public CD(int maCd, String tuaCd, int soBaiHat, double giaThanh) {
		this.maCd = 999999;
		this.tuaCd = "Chua xac dinh";
		this.soBaiHat = 0;
		this.giaThanh = 0;

		if (maCd > 0) {
			this.maCd = maCd;
		}

		if (tuaCd.length() > 0) {
			this.tuaCd = tuaCd;
		}

		if (soBaiHat > 0) {
			this.soBaiHat = soBaiHat;
		}

		if (giaThanh > 0) {
			this.giaThanh = giaThanh;
		}
	}

	public int getMaCd() {
		return maCd;
	}

	public void setMaCd(int maCd) {
		if (maCd > 0) {
			this.maCd = maCd;
		}
	}

	public String getTuaCd() {
		return tuaCd;
	}

	public void setTuaCd(String tuaCd) {
		if (tuaCd.length() > 0) {
			this.tuaCd = tuaCd;
		}
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		if (soBaiHat > 0) {
			this.soBaiHat = soBaiHat;
		}
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		if (giaThanh > 0) {
			this.giaThanh = giaThanh;
		}
	}

	@Override
	public String toString() {
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);

		return String.format("|%-20d|%-20s|%-20d|%-20s|", maCd, tuaCd, soBaiHat, nf.format(giaThanh));
	}
}
