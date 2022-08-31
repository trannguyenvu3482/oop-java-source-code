package bai14;

import java.util.Scanner;

public class TestOrder {
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pauseConsole() {
        System.out.println("\nBam Enter de tiep tuc...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        int luachon = -1;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        do {
            do {
                clearConsole();
                System.out.println("1. Them san pham vao don hang");
                System.out.println("2. Hien thi danh sach don hang");
                System.out.println("3. Thoat");
                System.out.print("\nNhap vao lua chon cua ban: ");

                luachon = sc.nextInt();
            } while (luachon < 1 || luachon > 3);

            switch (luachon) {
                case 1:
                    clearConsole();
                    System.out.println("Nhap ma san pham:");
                    String productID = sc.nextLine();
                    char temp = sc.next().charAt(0);
                    System.out.println("Nhap mo ta san pham:");
                    String productDesc = sc.nextLine();

                    System.out.println("Nhap gia san pham:");
                    double productPrice = sc.nextDouble();
                    System.out.println("Nhap so luong san pham:");
                    int productQuantity = sc.nextInt();
                    Product product = new Product(productDesc, productID, productPrice);
                    order.addLineitem(product, productQuantity);
                    pauseConsole();
                    break;
                case 2:
                    clearConsole();
                    System.out.println(order);
                    pauseConsole();
                    break;
                case 3:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
