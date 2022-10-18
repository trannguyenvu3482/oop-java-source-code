package bai06;

import java.util.Scanner;

public class TestPhongHoc {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DanhSachPhongHoc ds = new DanhSachPhongHoc(10);
		int choice;

		do {
			System.out.println("1. Them phong hoc vao danh sach");
			System.out.println("2. Tim kiem phong hoc theo ma phong");
			System.out.println("3. Lay thong tin toan bo danh sach cac phong hoc");
			System.out.println("4. Lay danh sach cac phong hoc dat chuan");
			System.out.println("5. Sap xep tang dan theo day nha");
			System.out.println("6. Sap xep giam dan theo dien tich");
			System.out.println("7. Sap xep tang dan theo so bong den");

			choice = sc.nextInt();
		} while (choice != 0);
	}
}
