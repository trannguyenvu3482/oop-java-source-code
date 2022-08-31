package bai12;

import java.io.IOException;
import java.util.Scanner;

public class TestCDList {

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
        System.out.println("Bam Enter de tiep tuc...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public static void main(String[] args) {
        int choice = 0;
        CDList cdList = new CDList();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        // Menu choice
        do {
            do {
                clearConsole();
                System.out.println("Menu chon:");
                System.out.println("1. Them CD vao danh sach");
                System.out.println("2. Tinh so luong CD trong danh sach");
                System.out.println("3. Tinh tong gia thanh cua cac CD");
                System.out.println("4. In thong tin toan bo CD trong danh sach");
                System.out.println("5. Sap xep danh sach giam dan theo gia thanh");
                System.out.println("6. Sap xep danh sach tang dan dua theo tua CD");
                System.out.println("7. Thoat");
                System.out.println("Nhap lua chon cua ban: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        clearConsole();
                        cdList.addCD();
                        clearConsole();
                        break;
                    case 2:
                        clearConsole();
                        System.out.println("So luong CD trong danh sach: " + cdList.countCD());
                        pauseConsole();
                        clearConsole();
                        break;
                    case 3:
                        clearConsole();
                        System.out.println("Tong gia thanh cua cac CD trong danh sach: " + cdList.tinhTongGiaThanh());
                        pauseConsole();
                        clearConsole();
                        break;
                    case 4:
                        clearConsole();
                        cdList.printCD();
                        pauseConsole();
                        clearConsole();
                        break;
                    case 5:
                        clearConsole();
                        cdList.sortCDTheoGiaThanh();
                        System.out.println("Danh sach da sap xep giam dan theo gia thanh");
                        pauseConsole();
                        clearConsole();
                        break;
                    case 6:
                        clearConsole();
                        cdList.sortCDTheoTuaCD();
                        System.out.println("Danh sach da sap xep tang dan theo tua CD");
                        pauseConsole();
                        clearConsole();
                        break;
                    case 7:
                        clearConsole();
                        System.out.println("Cam on ban da su dung chuong trinh");
                        exit = true;
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
            } while (choice < 1 || choice > 7);
        } while (exit == false);
    }
}
