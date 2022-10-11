package deThi_benhNhan;

import java.time.LocalDate;
import java.util.Objects;

public class BenhNhan {
	private String maSoBN;
	private String hoBN;
	private String tenBN;
	private String gioiTinh;
	private LocalDate ngaySinh;
	private String soDienThoai;
	private String nhomMau;
	private String diaChi;

	public BenhNhan(String maSoBN, String hoBN, String tenBN, String gioiTinh, LocalDate ngaySinh, String soDienThoai,
			String nhomMau, String diaChi) {
		this.maSoBN = maSoBN;
		this.hoBN = hoBN;
		this.tenBN = tenBN;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.nhomMau = nhomMau;
		this.diaChi = diaChi;
	}

	public String getMaSoBN() {
		return maSoBN;
	}

	public String getHoBN() {
		return hoBN;
	}

	public String getTenBN() {
		return tenBN;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public String getNhomMau() {
		return nhomMau;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setMaSoBN(String maSoBN) {
		this.maSoBN = maSoBN;
	}

	public void setHoBN(String hoBN) {
		this.hoBN = hoBN;
	}

	public void setTenBN(String tenBN) {
		this.tenBN = tenBN;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) throws Exception {
		if (ngaySinh.isBefore(LocalDate.now()) || ngaySinh.isEqual(LocalDate.now())) {
			this.ngaySinh = ngaySinh;
		} else
			throw new Exception("Ngay sinh phai truoc hoac bang ngay hien tai");
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public void setNhomMau(String nhomMau) {
		this.nhomMau = nhomMau;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSoBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BenhNhan other = (BenhNhan) obj;
		return Objects.equals(maSoBN, other.maSoBN);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
