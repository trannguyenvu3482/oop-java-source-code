package baiThi_TranThanhVy;

import java.text.NumberFormat;
import java.util.Locale;

public class CuocPhi {
	private ThueBao thueBao;
	private int thang;
	private int nam;
	private int soMBSuDung;
	final int GIACHUAN = 500;
	final int GIAVUOT = 400;

	public CuocPhi(ThueBao thueBao, int thang, int nam, int soMBSuDung) throws Exception {
		setThueBao(thueBao);
		setThang(thang);
		setNam(nam);
		setSoMBSuDung(soMBSuDung);
	}

	private boolean vuotChuan() {
		if (soMBSuDung > 200) {
			return true;
		}

		return false;
	}

	public int tinhTien() {
		if (vuotChuan()) {
			return (200 * GIACHUAN) + ((soMBSuDung - 200) * GIAVUOT);
		} else {
			return GIACHUAN * soMBSuDung;
		}
	}

	public ThueBao getThueBao() {
		return thueBao;
	}

	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	public int getSoMBSuDung() {
		return soMBSuDung;
	}

	public void setThueBao(ThueBao thueBao) {
		this.thueBao = thueBao;
	}

	public void setThang(int thang) throws Exception {
		if (thang >= 1 && thang <= 12) {
			this.thang = thang;
		} else
			throw new Exception("Thang khong hop le");
	}

	public void setNam(int nam) throws Exception {
		if (nam <= 2022) {
			this.nam = nam;
		} else
			throw new Exception("Nam khong hop le");
	}

	public void setSoMBSuDung(int soMBSuDung) throws Exception {
		if (soMBSuDung >= 0) {
			this.soMBSuDung = soMBSuDung;
		} else
			throw new Exception("So MB su dung phai >= 0");
	}

	@Override
	public String toString() {
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		return String.format("%-30s|%-20s|%-20s|%-20s", thueBao.getHoTen() + '(' + thueBao.getSoDienThoai() + ')',
				String.format("%d", thang) + '/' + String.format("%d", nam), soMBSuDung, nf.format(tinhTien()));
	}
}
