package arraylistTest;

public class TestArrList {
	public static void main(String[] args) {
		ListKhachHang lkh = new ListKhachHang();
		KhachHang kh1 = new KhachHang("001", "Vo Hoang Phuc", 12345);

		lkh.themKH(kh1);
//		lkh.themKH(kh1);

		System.out.println(lkh);
		System.out.println("Da chay xong");
	}
}
