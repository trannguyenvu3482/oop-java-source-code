package bai13;

import java.io.IOException;
import java.util.Scanner;

public class TestCongNhan {
    // Clear console
    public static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Pause console
    public static void pauseConsole() {
        System.out.println("\nBam Enter de tiep tuc...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public static void main(String[] args) {
        int choice = -1;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        DanhSachCongNhan ds = new DanhSachCongNhan();

        // Menu
        do {
            do {
                clearConsole();
                System.out.println("1. Them cong nhan vao danh sach");
                System.out.println("2. Xem danh sach cong nhan");
                System.out.println("3. Tinh so luong tat ca nhan vien co trong danh sach");
                System.out.println("4. Xuat thong tin cac nhan vien lam tren 200 san pham");
                System.out.println("5. Sap xep cong nhan theo so san pham giam dan");
                System.out.println("6. Thoat");
                System.out.println("Nhap lua chon: ");
                choice = sc.nextInt();

                if (choice < 1 || choice > 6) {
                    System.out.println("Lua chon khong hop le. Nhap lai: ");
                }
            } while (choice < 1 || choice > 6);

            switch (choice) {
                case 1:
                    clearConsole();
                    ds.addCongNhan();
                    pauseConsole();
                    break;
                case 2:
                    clearConsole();
                    ds.outputDSCN();
                    pauseConsole();
                    break;
                case 3:
                    clearConsole();
                    ds.outputSoLuong();
                    pauseConsole();
                    break;
                case 4:
                    clearConsole();
                    ds.outputDSCN_mSoSP();
                    pauseConsole();
                    break;
                case 5:
                    clearConsole();
                    ds.sortDSCN();
                    System.out.println("Da sap xep!");
                    pauseConsole();
                    break;
                case 6:
                    System.out.println("Cam on ban da su dung chuong trinh");
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
