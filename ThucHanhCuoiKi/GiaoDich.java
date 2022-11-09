package tranNguyenVu_21088201;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public abstract class GiaoDich {
	protected String maGD;
	protected Calendar ngayGD;
	protected double donGia;
	protected double dienTich;	
	
	public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) throws Exception {
		setMaGD(maGD);
		setNgayGD(ngayGD);
		setDonGia(donGia);
		setDienTich(dienTich);
	}

	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) throws Exception {
		if (maGD != null) {
			this.maGD = maGD;
		} else throw new Exception("Khong duoc rong");
	}

	public Calendar getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(Calendar ngayGD) {
		this.ngayGD = ngayGD;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) throws Exception {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else throw new Exception("Phai lon hon 0");
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) throws Exception {
		if (dienTich >= 0) {
			this.dienTich = dienTich;
		} else throw new Exception("Phai lon hon 0");
	}

	@Override
	public int hashCode() {
		return Objects.hash(maGD);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Objects.equals(maGD, other.maGD);
	}

	protected abstract double getThanhTien();
	
	Locale lc = new Locale("vi", "VN");
	NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
	DateFormat df = DateFormat.getDateInstance(1, lc);
	
	@Override
	public String toString() {
		String s = "";
		s += String.format("%-20s|%-20s|%-20s|%-20.2f|", getMaGD(), df.format(getNgayGD().getTime()), nf.format(getDonGia()), getDienTich());

		return s;
	}
}
