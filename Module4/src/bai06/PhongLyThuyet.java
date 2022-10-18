package bai06;

public class PhongLyThuyet extends PhongHoc {
	private boolean hasMayChieu;

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean hasMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.hasMayChieu = hasMayChieu;
	}

	public boolean isHasMayChieu() {
		return hasMayChieu;
	}

	public void setHasMayChieu(boolean hasMayChieu) {
		this.hasMayChieu = hasMayChieu;
	}

	@Override
	protected boolean checkDatChuan() {
		if (soBongDen / dienTich >= 10 && hasMayChieu) {
			return true;
		}
		return false;
	}
}
