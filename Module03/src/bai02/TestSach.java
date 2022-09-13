package bai02;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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

		// Create formatter to format money
		Locale locale = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

		SachGiaoKhoa sgk01 = new SachGiaoKhoa(1, new Date(), 100000.00, 3, "Kim Dong", "moi");
		SachGiaoKhoa sgk02 = new SachGiaoKhoa(2, new Date(), 50000.00, 2, "Kim Dong", "moi");
		SachGiaoKhoa sgk03 = new SachGiaoKhoa(3, new Date(), 75000.00, 2, "Ha Noi", "moi");
		SachThamKhao stk01 = new SachThamKhao(4, new Date(), 250000.00, 1, "Su That", 2000);
		SachThamKhao stk02 = new SachThamKhao(5, new Date(), 30000.00, 4, "Giao Duc", 2000);
		SachThamKhao stk03 = new SachThamKhao(6, new Date(), 30000.00, 4, "Chan Li", 2000);
		SachGiaoKhoa[] sgk = { sgk01, sgk02, sgk03 };
		SachThamKhao[] stk = { stk01, stk02, stk03 };
		Sach[] sach = { sgk01, sgk02, sgk03, stk01, stk02, stk03 };

		System.out.println("Tong thanh tien SGK: " + nf.format(tinhTongThanhTienSGK(sgk)));
		System.out.println("Tong thanh tien STK: " + nf.format(tinhTongThanhTienSTK(stk)));

		System.out.println();
		System.out.println("Nhap ten nha xuat ban can tim: ");
		String nxbX = sc.nextLine();

		List<Sach> result = timSachGiaoKhoaTheoNXB(sgk, nxbX);

		if (result.isEmpty()) {
			System.out.println("Khong tim thay sach nao cua NXB " + nxbX);
		} else {
			System.out.println();
			System.out.println("Cac sach giao khoa cua NXB " + nxbX + ":");
			for (Sach s : result) {
				System.out.println(s);
			}
		}

		System.out.println();
		System.out.println("Sach co thanh tien cao nhat: " + nf.format(timThanhTienCaoNhat(sach)));
	}
}
