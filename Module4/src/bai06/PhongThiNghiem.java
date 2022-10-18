package bai06;

public class PhongThiNghiem extends PhongHoc {
	private String chuyenNganh;
	private double sucChua;
	private boolean hasBonRua;

	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			double sucChua, boolean hasBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.hasBonRua = hasBonRua;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public double getSucChua() {
		return sucChua;
	}

	public boolean isHasBonRua() {
		return hasBonRua;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public void setSucChua(double sucChua) {
		this.sucChua = sucChua;
	}

	public void setHasBonRua(boolean hasBonRua) {
		this.hasBonRua = hasBonRua;
	}

	@Override
	protected boolean checkDatChuan() {
		if (soBongDen / dienTich >= 10 && hasBonRua) {
			return true;
		}
		return false;
	}
}
