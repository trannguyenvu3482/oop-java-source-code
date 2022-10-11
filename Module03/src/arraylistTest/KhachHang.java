package arraylistTest;

import java.util.Objects;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private int soDT;

	public KhachHang(String maKH, String tenKH, int soDT) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.soDT = soDT;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maKH, soDT, tenKH);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(maKH, other.maKH) && soDT == other.soDT && Objects.equals(tenKH, other.tenKH);
	}

	public String getMaKH() {
		return maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public int getSoDT() {
		return soDT;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public void setSoDT(int soDT) {
		this.soDT = soDT;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", soDT=" + soDT + "]";
	}

}
