package bai02;

import java.util.Scanner;

public class TestSach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SachGiaoKhoa sgk01 = new SachGiaoKhoa(0, null, 0, 0, null, null);
		SachGiaoKhoa sgk02 = new SachGiaoKhoa(0, null, 0, 0, null, null);
		SachThamKhao stk01 = new SachThamKhao(0, null, 0, 0, null, 0);
		SachThamKhao stk02 = new SachThamKhao(0, null, 0, 0, null, 0);

		System.out.println("Tong thanh tien SGK: " + (sgk01.getThanhTien() + sgk02.getThanhTien()));
		System.out.println("Tong thanh tien STK: " + (stk01.getThanhTien() + stk02.getThanhTien()));

		System.out.println();
		System.out.println("Nhap ten nha xuat ban can tim: ");
		String nxbX = sc.nextLine();
	}
}
