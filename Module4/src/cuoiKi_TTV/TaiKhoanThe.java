package cuoiKi_TTV;

import java.util.Objects;

public abstract class TaiKhoanThe {
	protected String maThe;
	protected String tenChu;

	public TaiKhoanThe() {

	}

	public TaiKhoanThe(String maThe, String tenChu) throws Exception {
		setMaThe(maThe);
		setTenChu(tenChu);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maThe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoanThe other = (TaiKhoanThe) obj;
		return Objects.equals(maThe, other.maThe);
	}

	public String getMaThe() {
		return maThe;
	}

	public String getTenChu() {
		return tenChu;
	}

	public void setMaThe(String maThe) throws Exception {
		if (maThe != null) {
			this.maThe = maThe;
		} else
			throw new Exception("Chuoi khong duoc rong");
	}

	public void setTenChu(String tenChu) throws Exception {
		if (tenChu != null) {
			this.tenChu = tenChu;
		} else
			throw new Exception("Chuoi khong duoc rong");
	}

	protected abstract boolean checkChiTieu();

	@Override
	public String toString() {
		String s = "";
		s += String.format("%-20s|%-20s|", getMaThe(), getTenChu());

		return s;
	}
}
