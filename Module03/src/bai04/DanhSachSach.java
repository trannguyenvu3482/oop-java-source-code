package bai04;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSach {
	private Sach[] listSach;
	private int count; // So luong sach hien tai trong danh sach

	public DanhSachSach(int count) {
		super();
		this.count = count;
	}

	public boolean checkMaSach(String maSachCheck) {
		for (Sach s : listSach) {
			if (maSachCheck.compareToIgnoreCase(s.getMaSach()) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean them(Sach sach) {
		if (count < listSach.length || !checkMaSach(sach.getMaSach())) {
			listSach[count] = sach;
			count = count + 1;
			return true;
		} else {
			return false;
		}
	}

	public double tinhTongThanhTienSGK() {
		return 0;
	}

	public double tinhTongThanhTienSTK() {
		return 0;
	}

	public List<Sach> timSachGiaoKhoaTheoNXB() {
		List<Sach> res = new ArrayList<Sach>();

		return res;
	}

	public double timThanhTienCaoNhat() {
		return 0;
	}
}
