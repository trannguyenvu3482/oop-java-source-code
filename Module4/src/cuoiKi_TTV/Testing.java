package cuoiKi_TTV;

public class Testing {
	public static void main(String[] args) throws Exception {
		DanhSachTaiKhoan ls = new DanhSachTaiKhoan();
		TaiKhoanThe tk1 = new TheGhiNo("001", "Tran Thanh Vy", 3000000);
		TaiKhoanThe tk2 = new TheGhiNo("002", "Vo Phuoc Hau", 40000);
		TaiKhoanThe tk3 = new TheGhiNo("003", "Tran Thanh Phuoc", 1000000);
		TaiKhoanThe tk4 = new TheTinDung("004", "Vo Thanh Hau", 1000000, 300000);
		TaiKhoanThe tk5 = new TheTinDung("005", "Vo Thanh A", 1000000, 200000);
		TaiKhoanThe tk6 = new TheTinDung("006", "Vo Thanh B", 2000000, 100000);
		TaiKhoanThe tk7 = new TheTinDung("007", "Vo Thanh C", 3000000, 50000);
		TaiKhoanThe tk8 = new TheTinDung("008", "Tran Phuoc Hau", 1000000, 2000000);

		ls.themTaiKhoan(tk1);
		ls.themTaiKhoan(tk2);
		ls.themTaiKhoan(tk3);
		ls.themTaiKhoan(tk4);
		ls.themTaiKhoan(tk5);
		ls.themTaiKhoan(tk6);
		ls.themTaiKhoan(tk7);
		ls.themTaiKhoan(tk8);

		System.out.println(ls);

		System.out.println("So tai khoan khong con kha nang chi tieu: " + ls.demTKKhongChiTieu());

		System.out.println();
		ls.maxHanMuc();

		System.out.println();
		ls.test();
	}
}
