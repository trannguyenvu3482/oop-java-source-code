package bai04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSach {
	public static double tinhTongThanhTienSGK(Sach[] dsSach) {
		double sum = 0;

		for (Sach s : dsSach) {
			sum += s.getThanhTien();
		}
		return sum;
	}

	public static double tinhTongThanhTienSTK(Sach[] dsSach) {
		double sum = 0;

		for (int i = 0; i < dsSach.length; i++) {
			sum = sum + dsSach[i].getThanhTien();
		}

		return sum;
	}

	public static List<Sach> timSachGiaoKhoaTheoNXB(Sach[] dsSach, String findName) {
		List<Sach> listSachHopLe = new ArrayList<Sach>();

		// Find book
		for (int i = 0; i < dsSach.length; i++) {
			if (findName.equals(dsSach[i].getNhaXuatBan())) {
				listSachHopLe.add(dsSach[i]);
			}
		}

		return listSachHopLe;
	}

	public static double timThanhTienCaoNhat(Sach[] dsSach) {
		double max = dsSach[0].getThanhTien();

		for (int i = 1; i < dsSach.length; i++) {
			if (dsSach[i].getThanhTien() > max) {
				max = dsSach[i].getThanhTien();
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
}
