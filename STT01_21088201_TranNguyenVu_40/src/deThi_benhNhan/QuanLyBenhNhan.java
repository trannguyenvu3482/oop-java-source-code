package deThi_benhNhan;

import java.util.Scanner;

public class QuanLyBenhNhan {
	public static Scanner sc = new Scanner(System.in);

	public static BenhNhan nhapBenhNhan() {
		BenhNhan bn = null;
		// ...

		return bn;
	}

	public static void main(String[] args) {
		int n;
		System.out.printf("Nhap so luong benh nhan: ");
		n = sc.nextInt();
		DanhSachBenhNhan ds = new DanhSachBenhNhan(n);

		int choice;

		do {
			do {
				System.out.println("1. Them moi mot benh nhan");
				System.out.println("2. In danh sach cac benh nhan");
				System.out.println("3. Tim kiem benh nhan theo ten");
				System.out.println("4. Sap xep danh sach benh nhan theo ngay sinh giam dan");
				System.out.println("5. Thoat");

				System.out.printf("Nhap vao lua chon: ");
				choice = sc.nextInt();
			} while (choice < 1 || choice > 5);

			String msBN = null;

			switch (choice) {
			case 1:
				ds.themMoiBenhNhan(nhapBenhNhan());
				break;
			case 2:
				System.out.println(ds);
				break;
			case 3:
				System.out.printf("Nhap vao ma so benh nhan can tim: ");
				msBN = sc.next();

				BenhNhan[] res = ds.timKiemBenhNhan(msBN);

				if (res == null) {
					System.err.println("Khong tim thay benh nhan");
				} else {
					for (BenhNhan bn : res) {
						System.out.println(bn);
					}
				}
				break;
			case 4:
				ds.sapXepDSBNNgaySinh();
				break;
			case 5:
				System.out.println("Cam on ban da su dung chuong trinh");
				break;
			}
		} while (choice != 5);
	}
}
