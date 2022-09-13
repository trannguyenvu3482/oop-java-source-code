package bai03;

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
		GiaoDichVang[] gdVang = { new GiaoDichVang(0, null, 0, 0, null), new GiaoDichVang(0, null, 0, 0, null),
				new GiaoDichVang(0, null, 0, 0, null) };
		GiaoDichTienTe[] gdTienTe = { new GiaoDichTienTe(0, null, 0, 0, 0, null),
				new GiaoDichTienTe(0, null, 0, 0, 0, null), new GiaoDichTienTe(0, null, 0, 0, 0, null) };

	}
}
