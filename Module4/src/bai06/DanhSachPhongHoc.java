package bai06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
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

	public void sortBySoBongDen() {
		Collections.sort(ls, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				if (o1.soBongDen < o2.soBongDen) {
					return -1;
				} else if (o1.soBongDen == o2.soBongDen) {
					return 0;
				} else {
					return 1;
				}
			}
		});
	}

	public void updatePhongMayTinh(String maPhong, int soMayTinh) throws Exception {
		PhongMayTinh ph = (PhongMayTinh) findPhongHoc(maPhong);

		if (ph != null) {
			ph.setSoMayTinh(soMayTinh);
		} else {
			throw new Exception("Khong tim thay phong hoc ");
		}
	}

	public void xoaPhongHoc(String maPhongHoc) throws Exception {
		PhongHoc ph = findPhongHoc(maPhongHoc);

		if (ph != null) {
			ls.remove(ph);
		} else {
			throw new Exception("Khong tim thay phong hoc");
		}
	}

	public int getSoPhongHoc() {
		return ls.size();
	}

	public List<PhongMayTinh> getPhongMT() {
		List<PhongMayTinh> listPMT = new ArrayList<PhongMayTinh>(ls.size());

		for (PhongMayTinh phongMayTinh : listPMT) {
			if (phongMayTinh.getSoMayTinh() == 60) {
				listPMT.add(phongMayTinh);
			}
		}

		return listPMT;
	}

	@Override
	public String toString() {
		String s = "";
		s += String.format("%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s\n", "Ma phong", "Day nha",
				"Dien tich", "So bong", "May chieu", "So may tinh", "Chuyen nganh", "Suc chua", "Bon rua");
		for (PhongHoc phongHoc : ls) {
			s += phongHoc.toString();
			s += "\n";
		}
		return s;
	}

}
