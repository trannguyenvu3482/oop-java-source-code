package bai04;

import java.util.Scanner;

public class TestSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien sv1 = new SinhVien(21088201, "Tran Nguyen Vu", 8.0, 9.0);
		SinhVien sv2 = new SinhVien(21077283, "Tran Ngoc Phat", 9.0, 8.0);

		// Create sv3 with default constructor
		SinhVien sv3 = new SinhVien();

		// Enter values for sv3
		System.out.println("Nhap ma so sinh vien cua SV3: ");
		int maSinhVien = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten cua SV3: ");
		String hoTen = sc.nextLine();
		System.out.println("Nhap diem ly thuyet cua SV3: ");
		double diemLT = sc.nextDouble();
		System.out.println("Nhap diem thuc hanh cua SV3: ");
		double diemTH = sc.nextDouble();

		// Using setters for sv3
		sv3.setMaSinhVien(maSinhVien);
		sv3.setHoTen(hoTen);
		sv3.setDiemLT(diemLT);
		sv3.setDiemTH(diemTH);

		// Output:
		System.out.println(
				String.format("%-10s %-30s %-10s %-10s %-10s", "Ma SV", "Ho va ten", "Diem LT", "Diem TH", "Diem TB"));
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		sc.close();
	}
}
