package bai12;

import java.util.Scanner;

public class TestCDList {

	public static void main(String[] args) {
		int choice = 0;
		CDList cdList = new CDList();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;

			// Menu choice
			do {
				do {
					// clearConsole();
					System.out.println("Menu chon:");
					System.out.println("1. Them CD vao danh sach");
					System.out.println("2. Tinh so luong CD trong danh sach");
					System.out.println("3. Tinh tong gia thanh cua cac CD");
					System.out.println("4. Xoa CD theo ma");
					System.out.println("5. Tim kiem CD theo ma");
					System.out.println("6. In thong tin toan bo CD trong danh sach");
					System.out.println("7. Sap xep danh sach giam dan theo gia thanh");
					System.out.println("8. Sap xep danh sach tang dan dua theo tua CD");
					System.out.println("9. Thoat");
					System.out.println("Nhap lua chon cua ban: ");
					choice = sc.nextInt();

					switch (choice) {
					case 1:
						cdList.addCD();
						break;
					case 2:
						System.out.println("So luong CD trong danh sach: " + cdList.countCD());
						break;
					case 3:
						System.out.println("Tong gia thanh cua cac CD trong danh sach: " + cdList.tinhTongGiaThanh());
						break;
					case 4:
						cdList.deleteCDByMaCD();
						break;
					case 5:
						System.out.println("Hay nhap ma CD can tim: ");
						int x = sc.nextInt();
						int result = cdList.findCDByMaCD(x);
						if (result == -1) {
							System.out.println("Khong tim thay CD can tim");
						} else {
							System.out.println("Da tim thay CD:");
							cdList.printOneCD(result);
						}
						break;
					case 6:
						cdList.printAllCD();
						break;
					case 7:
						cdList.sortCDTheoGiaThanh();
						System.out.println("Danh sach da sap xep giam dan theo gia thanh");
					case 8:
						cdList.sortCDTheoTuaCD();
						System.out.println("Danh sach da sap xep tang dan theo tua CD");
						break;
					case 9:
						System.out.println("Cam on ban da su dung chuong trinh");
						exit = true;
						break;
					default:
						System.out.println("Lua chon khong hop le");
						break;
					}
				} while (choice < 1 || choice > 9);
			} while (exit == false);
		}
	}
}
