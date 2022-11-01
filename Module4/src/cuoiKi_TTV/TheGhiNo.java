package cuoiKi_TTV;

import java.text.NumberFormat;
import java.util.Locale;

public class TheGhiNo extends TaiKhoanThe {
	private double soDu;

	public TheGhiNo() {

	}

	public TheGhiNo(String maThe, String tenChu, double soDu) throws Exception {
		super(maThe, tenChu);
		setSoDu(soDu);
	}

	@Override
	protected boolean checkChiTieu() {
		if (soDu >= 100000) {
			return true;
		} else {
			return false;
		}
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) throws Exception {
		if (soDu >= 0) {
			this.soDu = soDu;
		} else
			throw new Exception("So phai >= 0");
	}

	@Override
	public String toString() {
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		String s = super.toString();

		s += String.format("%-20s|%-20s|%-20s", nf.format(getSoDu()), "", "");

		return s;
	}
}
