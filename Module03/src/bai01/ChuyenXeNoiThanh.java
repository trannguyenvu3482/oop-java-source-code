package bai01;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKm;

	public ChuyenXeNoiThanh(int maSoChuyen, String hoTenTaiXe, int soXe, int doanhThu, int soTuyen, int soKm) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public int getSoKm() {
		return soKm;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}

}
