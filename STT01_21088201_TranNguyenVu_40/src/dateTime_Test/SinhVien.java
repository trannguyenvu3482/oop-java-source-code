package dateTime_Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private LocalDate ngaySinh;
	private Calendar ngaySinhCal;
	private double diemTB;

	public SinhVien(String maSV, String hoTen, Calendar ngaySinh, double diemTB) throws Exception {
		this.maSV = maSV;
		this.hoTen = hoTen;
		setNgaySinhCal(ngaySinh);
		this.diemTB = diemTB;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSV, other.maSV);
	}

	public String getMaSV() {
		return maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setNgaySinh(LocalDate ngaySinh) throws Exception {

		if (ngaySinh.isBefore(LocalDate.now()) || ngaySinh.isEqual(LocalDate.now())) {
			this.ngaySinh = ngaySinh;
		} else
			throw new Exception("Ngay sinh phai truoc ngay hien tai");
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public Calendar getNgaySinhCal() {
		return ngaySinhCal;
	}

	public void setNgaySinhCal(Calendar ngaySinhCal) throws Exception {
		if (ngaySinhCal.getTime().before(Calendar.getInstance().getTime())) {
			this.ngaySinhCal = ngaySinhCal;
		} else
			throw new Exception("Phai truoc ngay hien tai");
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diemTB=" + diemTB + "]";
	}

}
