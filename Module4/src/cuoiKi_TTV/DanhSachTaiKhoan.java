package cuoiKi_TTV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachTaiKhoan {
	private List<TaiKhoanThe> ls;

	public DanhSachTaiKhoan() {
		ls = new ArrayList<TaiKhoanThe>();
	}

	public boolean themTaiKhoan(TaiKhoanThe t) {
		if (ls.contains(t)) {
			return false;
		} else {
			return ls.add(t);
		}
	}

	public int demTKKhongChiTieu() {
		int count = 0;
		for (TaiKhoanThe t : ls) {
			if (!t.checkChiTieu()) {
				count++;
			}
		}

		return count;
	}

	public boolean suaHanMuc(String maThe, double hanMuc) throws Exception {
		for (TaiKhoanThe t : ls) {
			if (t.getMaThe().equals(maThe) && t instanceof TheTinDung) {
				((TheTinDung) t).setHanMuc(hanMuc);
				return true;
			}
		}

		return false;
	}

	public void sapXepTheoMa() {
		Collections.sort(ls, new Comparator<TaiKhoanThe>() {
			@Override
			public int compare(TaiKhoanThe o1, TaiKhoanThe o2) {
				if (o1.getMaThe().compareTo(o2.getMaThe()) > 0) {
					return -1;
				} else if (o1.getMaThe().compareTo(o2.getMaThe()) < 0) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}

	@Override
	public String toString() {
		String s = "";
		s += String.format("%-20s|%-20s|%-20s|%-20s|%-20s\n", "Ma the", "Chu the", "So du", "Han muc",
				"Chi tieu trong thang");
		for (TaiKhoanThe t : ls) {
			s += t.toString();
			s += "\n";
		}

		return s;
	}
}
