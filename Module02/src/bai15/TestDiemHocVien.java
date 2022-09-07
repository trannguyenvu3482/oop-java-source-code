package bai15;

public class TestDiemHocVien {
	public static void main(String[] args) {
		DiemHocVien dhv = new DiemHocVien();

		dhv.themDiemHocVien(new HocVien(1, 2, 3, 4, 5));
		dhv.themDiemHocVien(new HocVien(2, 3, 8, 8, 10));
		dhv.themDiemHocVien(new HocVien(6, 7, 6, 5, 5));
		dhv.themDiemHocVien(new HocVien(6, 7, 6, 5, 5));
		dhv.themDiemHocVien(new HocVien(6, 7, 6, 5, 5));
		dhv.themDiemHocVien(new HocVien(10, 10, 10, 10, 10));
		dhv.countSoLuong();

		System.out.println(dhv);
	}
}