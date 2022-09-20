package bai13;

import java.util.Scanner;

public class TestCongNhan {
	public static void main(String[] args) {
		int choice = -1;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		DanhSachCongNhan ds = new DanhSachCongNhan();

		// Menu
		do {
			do {
				System.out.println("1. Them cong nhan vao danh sach");
				System.out.println("2. Xem danh sach cong nhan");
				System.out.println("3. Xem so luong tat ca nhan vien co trong danh sach");
				System.out.println("4. Xoa cong nhan theo ma cong nhan");
				System.out.println("5. Xuat thong tin cac nhan vien lam tren 200 san pham");
				System.out.println("6. Sap xep cong nhan theo so san pham giam dan");
				System.out.println("7. Thoat");
				System.out.println("Nhap lua chon: ");
				choice = sc.nextInt();

				if (choice < 1 || choice > 7) {
					System.out.println("Lua chon khong hop le. Nhap lai: ");
				}
			} while (choice < 1 || choice > 7);

			switch (choice) {
			case 1:
				ds.addCongNhan();
				break;
			case 2:
				ds.outputDSCN();
				break;
			case 3:
				ds.outputSoLuong();
				break;
			case 4:
				System.out.println("Nhap vao ma CN can xoa: ");
				int delMaCN = sc.nextInt();
				ds.deleteCongNhanByMaCN(delMaCN);
				break;
			case 5:
				ds.outputDSCN_mSoSP();
				break;
			case 6:
				ds.sortDSCN();
				System.out.println("Da sap xep!");
				break;
			case 7:
				System.out.println("Cam on ban da su dung chuong trinh");
				exit = true;
				break;
			}
		} while (!exit);
	}
}
