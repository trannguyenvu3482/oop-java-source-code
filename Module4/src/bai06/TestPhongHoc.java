package bai06;

import java.util.Scanner;

public class TestPhongHoc {
	public static Scanner sc = new Scanner(System.in);

	public static PhongLyThuyet nhapPhongLyThuyet() {
		String maPhong, dayNha, temp;
		double dienTich;
		int soBongDen;
		System.out.printf("Nhap ma phong: ");
		maPhong = sc.next();
		System.out.printf("Nhap day nha: ");
		dayNha = sc.next();
		System.out.printf("Nhap dien tich: ");
		dienTich = sc.nextDouble();
		System.out.printf("Nhap so bong den: ");
		soBongDen = sc.nextInt();
		System.out.printf("Phong hoc co may chieu khong (Co/Khong): ");
		temp = sc.next();

		if (temp.equalsIgnoreCase("co")) {
			return new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, true);
		} else {
			return new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, false);
		}
	}

	public static PhongMayTinh nhapPhongMayTinh() {
		String maPhong, dayNha;
		double dienTich;
		int soBongDen, soMayTinh;
		System.out.printf("Nhap ma phong: ");
		maPhong = sc.next();
		System.out.printf("Nhap day nha: ");
		dayNha = sc.next();
		System.out.printf("Nhap dien tich: ");
		dienTich = sc.nextDouble();
		System.out.printf("Nhap so bong den: ");
		soBongDen = sc.nextInt();
		System.out.printf("Nhap so may tinh : ");
		soMayTinh = sc.nextInt();

		return new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
	}

	public static PhongThiNghiem nhapPhongThiNghiem() {
		String maPhong, dayNha, chuyenNganh, temp;
		double dienTich, sucChua;
		int soBongDen;
		System.out.printf("Nhap ma phong: ");
		maPhong = sc.next();
		System.out.printf("Nhap day nha: ");
		dayNha = sc.next();
		System.out.printf("Nhap dien tich: ");
		dienTich = sc.nextDouble();
		System.out.printf("Nhap so bong den: ");
		soBongDen = sc.nextInt();
		System.out.printf("Nhap chuyen nganh : ");
		chuyenNganh = sc.next();
		System.out.printf("Nhap suc chua: ");
		sucChua = sc.nextDouble();
		System.out.printf("Phong hoc co bon rua hay khong (Co/Khong): ");
		temp = sc.next();

		if (temp.equalsIgnoreCase("co")) {
			return new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, true);
		} else {
			return new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, false);
		}
	}

	public static void main(String[] args) {
		DanhSachPhongHoc ds = new DanhSachPhongHoc(10);
		int choice;

		do {
			do {
				System.out.println("1. Them phong hoc vao danh sach");
				System.out.println("2. Tim kiem phong hoc theo ma phong");
				System.out.println("3. Lay thong tin toan bo danh sach cac phong hoc");
				System.out.println("4. Lay danh sach cac phong hoc dat chuan");
				System.out.println("5. Sap xep tang dan theo day nha");
				System.out.println("6. Sap xep giam dan theo dien tich");
				System.out.println("7. Sap xep tang dan theo so bong den");
				System.out.println("8. Cap nhat so may tinh theo ma phong");
				System.out.println("9. Xoa mot phong hoc theo ma phong");
				System.out.println("10. Tinh tong so phong hoc");
				System.out.println("11. Lay danh sach phong may co 60 may");
				System.out.println("0. Thoat");
				System.out.println();

				System.out.printf("Nhap vao lua chon cua ban: ");
				choice = sc.nextInt();
			} while (choice < 0 || choice > 11);

			switch (choice) {
			case 1:
				do {
					System.out.println();
					System.out.println("Chon loai phong hoc muon them vao");
					System.out.println("1. Phong hoc ly thuyet");
					System.out.println("2. Phong may tinh");
					System.out.println("3. Phong thi nghiem");

				} while (choice < 1 || choice > 3);
				break;
			case 2:
				break;
			case 3:
				System.out.println(ds);
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 0:
				break;
			default:
				break;
			}
		} while (choice != 0);
	}
}
