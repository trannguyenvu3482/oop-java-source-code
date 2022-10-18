package bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachPhongHoc {
	List<PhongHoc> ls;

	public DanhSachPhongHoc(int n) {
		ls = new ArrayList<PhongHoc>(n);
	}

	public void addPhongHoc(PhongHoc p) throws Exception {
		if (ls.contains(p)) {
			throw new Exception("Trung ma phong");
		} else {
			ls.add(p);
		}
	}

	public PhongHoc findPhongHoc(String maPhong) {
		for (PhongHoc phongHoc : ls) {
			if (phongHoc.getMaPhong().equals(maPhong)) {
				return phongHoc;
			}
		}

		return null;
	}

	public List<PhongHoc> getPhongDatChuan() {
		List<PhongHoc> listDatChuan = new ArrayList<PhongHoc>(ls.size());

		for (PhongHoc phongHoc : listDatChuan) {
			if (phongHoc.checkDatChuan()) {
				listDatChuan.add(phongHoc);
			}
		}

		return listDatChuan;
	}

	public void sortByDayNha() {
		Collections.sort(ls, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				return o1.dayNha.compareTo(o2.dayNha);
			}
		});
	}

	public void sortByDienTich() {
		Collections.sort(ls, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				if (o1.dienTich < o2.dienTich) {
					return 1;
				} else if (o1.dienTich == o2.dienTich) {
					return 0;
				} else {
					return -1;
				}
			}
		});
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
