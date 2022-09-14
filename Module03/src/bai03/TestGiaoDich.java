package bai03;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class TestGiaoDich {
	public static int tinhTongSoLuongGD(GiaoDich[] listGiaoDich) {
		int countSL = 0;

		for (GiaoDich gd : listGiaoDich) {
			countSL += gd.getSoLuong();
		}

		return countSL;
	}

	public static double tinhTrungBinhThanhTien(GiaoDich[] listGiaoDich) {
		double sum = 0;

		for (GiaoDich gd : listGiaoDich) {
			sum += gd.getThanhTien();
		}

		return sum / listGiaoDich.length;
	}

	public static void xuatGiaoDich(GiaoDich[] listGiaoDich) {
		for (GiaoDich gd : listGiaoDich) {
			if (gd.getDonGia() > 1000000000) {
				System.out.println(gd);
			}
		}
	}

	public static void main(String[] args) {
		// Create formatter to format money
		Locale locale = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

		GiaoDichVang[] gdVang = { new GiaoDichVang(1, new Date(), 5000, 3, "SCJ"),
				new GiaoDichVang(2, new Date(), 2500, 4, "SCJ"), new GiaoDichVang(3, new Date(), 1000, 5, "9999") };
		GiaoDichTienTe[] gdTienTe = { new GiaoDichTienTe(4, new Date(), 1500000000, 3, 1, "VND"),
				new GiaoDichTienTe(5, new Date(), 500, 2, 23000, "USD"),
				new GiaoDichTienTe(6, new Date(), 7000, 6, 23000, "EUR") };

		System.out.println("Tong so luong giao dich vang: " + tinhTongSoLuongGD(gdVang));
		System.out.println("Tong so luong giao dich tien te: " + tinhTongSoLuongGD(gdTienTe));
		System.out
				.println("Thanh tien trung binh cua giao dich tien te: " + nf.format(tinhTrungBinhThanhTien(gdTienTe)));

		System.out.println();
		System.out.println("Cac giao dich co don gia hon 1 ty: ");
		xuatGiaoDich(gdTienTe);
		xuatGiaoDich(gdVang);
	}
}
