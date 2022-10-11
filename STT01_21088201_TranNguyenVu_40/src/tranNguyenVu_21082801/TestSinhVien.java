package tranNguyenVu_21082801;

public class TestSinhVien {
	public static void main(String[] args) {
		DanhSachSV ds = new DanhSachSV(10);

		SinhVien sv1 = new SinhVien("001", "ABC", 5, 5);
		SinhVien sv2 = new SinhVien("002", "ABC", 5, 5);
		SinhVien sv3 = new SinhVien("003", "ABC", 5, 5);
		SinhVien sv4 = new SinhVien("004", "ABC", 5, 5);
		SinhVien sv5 = new SinhVien("005", "ABC", 5, 5);

		ds.themSV(sv1);
//		ds.themSV(sv2);
//		ds.themSV(sv3);
//		ds.themSV(sv4);
//		ds.themSV(sv5);

		System.out.println(sv1);
	}
}
