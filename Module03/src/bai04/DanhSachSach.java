package bai04;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSach {
	private Sach[] listSach;
	private int count; // So luong sach hien tai trong danh sach

	public DanhSachSach(int size) {
		this.count = 0;

		listSach = new Sach[size];
	}

	public boolean checkMaSach(String maSachCheck) {
		for (Sach s : listSach) {
			if (s != null && maSachCheck.compareToIgnoreCase(s.getMaSach()) == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean them(Sach sach) {
		if (count == 0 || (count < listSach.length && !checkMaSach(sach.getMaSach()))) {
			listSach[count] = sach;
			count = count + 1;
			return true;
		} else {
			return false;
		}
	}

	public double tinhTongThanhTienSGK() {
		double sum = 0;

		for (Sach s : listSach) {
			if (s != null && s instanceof SachGiaoKhoa) {
				sum += s.getThanhTien();
			}
		}
		return sum;
	}

	public double tinhTongThanhTienSTK() {
		double sum = 0;

		for (Sach s : listSach) {
			if (s != null && s instanceof SachThamKhao) {
				sum += s.getThanhTien();
			}
		}

		return sum;
	}

	public List<Sach> timSachGiaoKhoaTheoNXB(String findName) {

		List<Sach> listSachHopLe = new ArrayList<Sach>();

		// Find book
		if (count > 0) {
			for (int i = 0; i < listSach.length; i++) {
				if (findName.equals(listSach[i].getNhaXuatBan())) {
					listSachHopLe.add(listSach[i]);
				}
			}

		}
		return listSachHopLe;
	}

	public double timThanhTienCaoNhat() {
		if (count > 0) {
			double max = listSach[0].getThanhTien();

			for (int i = 1; i < count; i++) {
				if (listSach[i].getThanhTien() > max) {
					max = listSach[i].getThanhTien();
				}
			}

			return max;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		if (count > 0) {
			System.out.println("List sach hien tai:");
			System.out.printf("%-10s|%-10s|%-10s|%-10s|%-20s|%-20s|%-10s|\n", "Ma sach", "Ngay nhap", "Don gia",
					"So luong", "Nha xuat ban", "Tinh trang", "Thue");
			for (Sach s : listSach) {
				if (s != null) {
					System.out.println(s);
				}
			}
		} else {
			System.out.println("Hien tai chua co sach!");
		}
		return "";
	}
}
