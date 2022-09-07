package bai11;

import java.time.LocalDate;

public class TestSoTietKiem {
	public static void main(String[] args) {
		KhachHang kh1 = new KhachHang("KH001", "Nguyen Van An", 0);

		kh1.themSoTietKiem(new SoTietKiem("111", LocalDate.of(2021, 7, 31), 1000000.00, 3, 0.005));
		kh1.themSoTietKiem(new SoTietKiem("112", LocalDate.of(2021, 4, 21), 10000000, 6, 0.006));

		System.out.println(kh1);
	}
}