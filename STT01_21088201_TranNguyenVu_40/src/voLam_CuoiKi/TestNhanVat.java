import java.util.Scanner;

public class TestNhanVat {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DanhSachNguoiChoi lsNguoiChoi = new DanhSachNguoiChoi();
        DanhSachQuaiVat lsQuaiVat = new DanhSachQuaiVat();
        int choice = 0;
        do {
            do {
                System.out.println("1. Them nguoi choi");
                System.out.println("2. Them quai vat");
                System.out.println("3. Xuat danh sach nguoi choi");
                System.out.println("4. Xuat danh sach quai vat");
                System.out.println("5. Tim nguoi choi co muc sat thuong cao nhat");
                System.out.println("6. Tim quai vat co muc sat thuong cao nhat");
                System.out.println("7. Thoat");
                System.out.print("Nhap lua chon: ");
                choice = sc.nextInt();
            } while (choice < 1 || choice > 7);

            sc.nextLine();
            switch (choice) {
                case 1:
                    NhanVat player1 = new NhanVat(1, 50, "Thieu lam");
                    NhanVat player2 = new NhanVat(1, 50, "Cai bang");
                    NhanVat player3 = new NhanVat(30, 200, "Duong mon");
                    NhanVat player4 = new NhanVat(50, 500, "Vo Dang");

                    lsNguoiChoi.themNguoiChoi(player1);
                    lsNguoiChoi.themNguoiChoi(player2);
                    lsNguoiChoi.themNguoiChoi(player3);
                    lsNguoiChoi.themNguoiChoi(player4);
                    break;
                case 2:
                    QuaiVat monster1 = new QuaiVat(1, 10, "Kim", "Thong thuong");
                    QuaiVat monster2 = new QuaiVat(1, 10, "Moc", "Thong thuong");
                    QuaiVat monster3 = new QuaiVat(10, 100, "Thuy", "Thong thuong");
                    QuaiVat monster4 = new QuaiVat(20, 150, "Hoa", "Dau linh");

                    lsQuaiVat.themQuaiVat(monster1);
                    lsQuaiVat.themQuaiVat(monster2);
                    lsQuaiVat.themQuaiVat(monster3);
                    lsQuaiVat.themQuaiVat(monster4);
                    break;
                case 3:
                    System.out.println("Danh sach nguoi choi: ");
                    System.out.println(lsNguoiChoi);
                    break;
                case 4:
                    System.out.println("Danh sach quai vat: ");
                    System.out.println(lsQuaiVat);
                    break;
                case 5:
                    lsNguoiChoi.timMaxSatThuong();
                    break;
                case 6:
                    lsQuaiVat.timMaxSatThuong();
                    break;
                case 7:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        } while (choice != 7);
    }
}
