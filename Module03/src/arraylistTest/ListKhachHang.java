package arraylistTest;

import java.util.ArrayList;
import java.util.List;

public class ListKhachHang {
	private List<KhachHang> ls;

	public ListKhachHang() {
		ls = new ArrayList<KhachHang>(10);
	}

	public List<KhachHang> getLs() {
		return ls;
	}

	public void setLs(List<KhachHang> ls) {
		this.ls = ls;
	}

	public boolean themKH(KhachHang k) {
		if (k instanceof KhachHang) {
			return false;
		} else {
			ls.add(k);
			return true;
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (KhachHang k : ls) {
			s += k.toString() + "\n";
		}

		return s;
	}

}
