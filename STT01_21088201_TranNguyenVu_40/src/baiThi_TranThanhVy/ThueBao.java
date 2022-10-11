package baiThi_TranThanhVy;

public class ThueBao {
	private String soDienThoai;
	private String hoTen;

	public ThueBao() {
		this.soDienThoai = "un-known";
		this.hoTen = "un-known";
	}

	public ThueBao(String soDienThoai, String hoTen) throws Exception {
		setSoDienThoai(soDienThoai);
		setHoTen(hoTen);
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setSoDienThoai(String soDienThoai) throws Exception {
		if (soDienThoai.length() > 0) {
			this.soDienThoai = soDienThoai;
		} else
			throw new Exception("Chuoi khong duoc rong");
	}

	public void setHoTen(String hoTen) throws Exception {
		if (hoTen.length() > 0) {
			this.hoTen = hoTen;
		} else
			throw new Exception("Chuoi khong duoc rong");
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", hoTen, soDienThoai);
	}
}
