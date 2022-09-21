package bai14;

import java.util.Scanner;

public class TestOrder {
	public static void main(String[] args) {
		Order order = new Order();
		int luachon = -1;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.println("1. Them san pham vao don hang");
				System.out.println("2. Hien thi danh sach don hang");
				System.out.println("3. Thoat");
				System.out.print("\nNhap vao lua chon cua ban: ");
				luachon = sc.nextInt();
			} while (luachon < 1 || luachon > 3);

			switch (luachon) {
			case 1:
				System.out.println("Nhap ma san pham:");
				String productID = sc.next();
				System.out.println("Nhap mo ta san pham:");
				String productDesc = sc.next();
				System.out.println("Nhap gia san pham:");
				double productPrice = sc.nextDouble();
				System.out.println("Nhap so luong san pham:");
				int productQuantity = sc.nextInt();

				Product product;
				try {
					product = new Product(productDesc, productID, productPrice);
					order.addLineitem(product, productQuantity);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println(order);
				break;
			case 3:
				System.out.println("Cam on ban da su dung chuong trinh!");
				exit = true;
				break;
			}
		} while (!exit);
	}
}
