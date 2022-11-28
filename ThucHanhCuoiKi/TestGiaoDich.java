package tranNguyenVu_21088201;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestGiaoDich {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		DanhSachGiaoDich ls = new DanhSachGiaoDich();
		int choice;
		do {
			do {
				System.out.println();
				System.out.println("1. Them doi tuong vao list");
				System.out.println("2. Xoa doi tuong theo ma giao dich");
				System.out.println("3. Tinh so luong giao dich co trong danh sach");
				System.out.println("4. Tinh tong doanh thu theo moi thang");
				System.out.println("5. Sap xep danh sach tang dan theo ma");
				System.out.println("6. Xuat tat ca giao dich");
				System.out.println("7. Xuat toan bo danh sach theo ngay 28/11/2022 va giao dich thanh tien lon nhat");
				System.out.println("8. Thoat");
				
				System.out.printf("Nhap lua chon: ");
				choice = sc.nextInt();
			} while (choice < 1 || choice > 8);
			
			switch (choice) {
			case 1:
				GiaoDich gd1 = new GiaoDichDat("002", new GregorianCalendar(2022, 4, 5), 200000, 500, "A");
				GiaoDich gd2 = new GiaoDichNha("003", new GregorianCalendar(2022, 3, 12), 50000, 800, "Cao cap", "312 Nguyen Thai Son");
				GiaoDich gd3 = new GiaoDichDat("001", new GregorianCalendar(2022, 10, 28), 100000, 600, "B");
				GiaoDich gd4 = new GiaoDichNha("004", new GregorianCalendar(2022, 10, 28), 500000, 1000, "Cao cap", "100 Nguyen Van Bao");
				
				ls.themGiaoDich(gd1);
				ls.themGiaoDich(gd2);
				ls.themGiaoDich(gd3);
				ls.themGiaoDich(gd4);
				break;
			case 2:
				String maGD;
				System.out.println("Nhap vao ma giao dich can xoa: ");
				sc.nextLine();
				maGD = sc.nextLine();
				
				if (ls.xoaGiaoDich(maGD)) {
					System.out.println("Xoa thanh cong");
				} else {
					System.out.println("Xoa that bai");
				}
				break;
			case 3:
				System.out.println("So luong giao dich: " + ls.getSoLuongGD());
				break;
			case 4:
				ls.printTongDoanhThu();
				break;
			case 5:
				ls.sapXepTheoMa();
				break;
			case 6:
				System.out.println(ls);
				break;
			case 7:
				ls.xuatTheoNgay();
				break;
			case 8:
				System.out.println("Cam on ban da su dung chuong trinh");
				break;
			default:
				break;
			}
		} while (choice != 8);
	}
}
