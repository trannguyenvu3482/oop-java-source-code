package bai01;

public class ChuyenXe {
	private int maSoChuyen;
	private String hoTenTaiXe;
	private int soXe;
	private int doanhThu;

	public ChuyenXe(int maSoChuyen, String hoTenTaiXe, int soXe, int doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public int getMaSoChuyen() {
		return maSoChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public int getSoXe() {
		return soXe;
	}

	public int getDoanhThu() {
		return doanhThu;
	}

	public void setMaSoChuyen(int maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}

	public void setDoanhThu(int doanhThu) {
		this.doanhThu = doanhThu;
	}

}
