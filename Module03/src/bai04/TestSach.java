package bai04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestSach {
	public static SachGiaoKhoa inputSachGiaoKhoa() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma sach: ");
		String maSach = sc.next();
		System.out.println("Nhap vao don gia: ");
		double donGia = sc.nextDouble();
		System.out.println("Nhap vao so luong sach: ");
		int soLuong = sc.nextInt();
		System.out.println("Nhap vao nha xuat ban: ");
		String nxb = sc.next();
		System.out.println("Nhap tinh trang (T/F): ");
		boolean tinhTrang = sc.nextBoolean();

		return new SachGiaoKhoa(maSach, LocalDate.now(), donGia, soLuong, nxb, tinhTrang);
	}

	public static SachThamKhao inputSachThamKhao() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma sach: ");
		String maSach = sc.next();
		System.out.println("Nhap vao don gia: ");
		double donGia = sc.nextDouble();
		System.out.println("Nhap vao so luong sach: ");
		int soLuong = sc.nextInt();
		System.out.println("Nhap vao nha xuat ban: ");
		String nxb = sc.next();
		System.out.println("Nhap vao thue: ");
		double thue = sc.nextDouble();

		return new SachThamKhao(maSach, LocalDate.now(), donGia, soLuong, nxb, thue);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luachon = 0;
		DanhSachSach dsSach = new DanhSachSach(6);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale local = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);

		do {
			System.out.println("Menu:");
			System.out.println("1. Them mot cuon sach moi");
			System.out.println("2. Tinh tong thanh tien cac loai sach");
			System.out.println("3. Tim cac sach cua nha xuat ban X");
			System.out.println("4. Tim thanh tien cao nhat");
			System.out.println("5. In ra cac cuon sach hien tai");
			System.out.println("6. Thoat");
			System.out.println("Nhap vao lua chon: ");
			luachon = sc.nextInt();

			switch (luachon) {
			case 1:
				int chonSach;
				do {
					System.out.println("Ban muon them loai sach nao: ");
					System.out.println("1. Sach giao khoa");
					System.out.println("2. Sach tham khao");
					chonSach = sc.nextInt();
				} while (chonSach != 1 && chonSach != 2);

				if (chonSach == 1) {
					SachGiaoKhoa sgk = inputSachGiaoKhoa();
					if (dsSach.them(sgk)) {
						System.out.println("Da them!");
					} else {
						System.out.println("Khong the them sach vao danh sach");
					}
				} else {
					SachThamKhao stk = inputSachThamKhao();
					if (dsSach.them(stk)) {
						System.out.println("Da them!");
					} else {
						System.out.println("Khong the them sach vao danh sach");
					}
				}
				break;
			case 2:
				System.out.println("Tong thanh tien SGK: " + nf.format(dsSach.tinhTongThanhTienSGK()));
				System.out.println("Tong thanh tien STK: " + nf.format(dsSach.tinhTongThanhTienSTK()));
				break;
			case 3:
				System.out.println();
				System.out.println("Nhap ten nha xuat ban can tim: ");
				String nxbX = sc.next();

				List<Sach> result = dsSach.timSachGiaoKhoaTheoNXB(nxbX);

				if (result.isEmpty()) {
					System.out.println("Khong tim thay sach nao cua NXB " + nxbX);
				} else {
					System.out.println();
					System.out.println("Cac sach giao khoa cua NXB " + nxbX + ":");
					for (Sach s : result) {
						System.out.println(s);
					}
				}
				break;
			case 4:
				double result1 = dsSach.timThanhTienCaoNhat();
				if (result1 == -1) {
					System.out.println("Danh sach rong");
				} else {
					System.out.println("Thanh tien cao nhat: " + nf.format(result1));
				}
				break;
			case 5:
				System.out.println(dsSach);
				break;
			case 6:
				System.out.println("Cam on ban da su dung chuong trinh");
				break;
			default:
				break;
			}

		} while (luachon != 6);
	}
}
