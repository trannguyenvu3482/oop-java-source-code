package cuoiKi_TTV;

public class Testing {
	public static void main(String[] args) throws Exception {
		DanhSachTaiKhoan ls = new DanhSachTaiKhoan();
		TaiKhoanThe tk1 = new TheGhiNo("001", "Tran Thanh Vy", 3000000);
		TaiKhoanThe tk2 = new TheGhiNo("002", "Vo Phuoc Hau", 40000);
		TaiKhoanThe tk3 = new TheGhiNo("003", "Tran Thanh Phuoc", 1000000);
		TaiKhoanThe tk4 = new TheTinDung("004", "Vo Thanh Hau", 1000000, 300000);
		TaiKhoanThe tk5 = new TheTinDung("005", "Tran Phuoc Hau", 1000000, 2000000);

		ls.themTaiKhoan(tk1);
		ls.themTaiKhoan(tk2);
		ls.themTaiKhoan(tk3);
		ls.themTaiKhoan(tk4);
		ls.themTaiKhoan(tk5);

		System.out.println(ls);

		System.out.println("So tai khoan khong con kha nang chi tieu: " + ls.demTKKhongChiTieu());

		System.out.println();
		System.out.println("Danh sach sau khi sua han muc cua tai khoan 004 thanh 500000");
		ls.suaHanMuc("004", 500000);
		System.out.println(ls);

		System.out.println("Danh sach sau khi sap xep theo ma");
		ls.sapXepTheoMa();
		System.out.println(ls);
	}
}
