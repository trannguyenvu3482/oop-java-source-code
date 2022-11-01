package cuoiKi_TTV;

import java.text.NumberFormat;
import java.util.Locale;

public class TheTinDung extends TaiKhoanThe {
	private double hanMuc;
	private double chiTieuThang;

	public TheTinDung() {

	}

	public TheTinDung(String maThe, String tenChu, double hanMuc, double chiTieuThang) throws Exception {
		super(maThe, tenChu);
		setHanMuc(hanMuc);
		setChiTieuThang(chiTieuThang);
	}

	@Override
	protected boolean checkChiTieu() {
		if (chiTieuThang <= hanMuc) {
			return true;
		} else
			return false;
	}

	public double getHanMuc() {
		return hanMuc;
	}

	public double getChiTieuThang() {
		return chiTieuThang;
	}

	public void setHanMuc(double hanMuc) throws Exception {
		if (hanMuc >= 0) {
			this.hanMuc = hanMuc;
		} else
			throw new Exception("So phai >= 0");
	}

	public void setChiTieuThang(double chiTieuThang) throws Exception {
		if (chiTieuThang >= 0) {
			this.chiTieuThang = chiTieuThang;
		} else
			throw new Exception("So phai >= 0");
	}

	@Override
	public String toString() {
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		String s = super.toString();

		s += String.format("%-20s|%-20s|%-20s|", "", nf.format(getHanMuc()), nf.format(getChiTieuThang()));

		return s;
	}
}
