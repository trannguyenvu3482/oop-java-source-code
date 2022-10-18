package bai06;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	protected boolean checkDatChuan() {
		if ((soBongDen / dienTich >= 10) && (soMayTinh / dienTich >= 1.5)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Phong may tinh";
	}
}
