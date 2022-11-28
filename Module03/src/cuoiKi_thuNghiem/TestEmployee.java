package cuoiKi_thuNghiem;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        DanhSachNhanVien ls = new DanhSachNhanVien();
        int choice;

        do {
            System.out.println("1. Them nhan vien vao danh sach");
            System.out.println("2. Dem so luong nhan vien tot nghiep");
            System.out.println("3. Sua ngay sinh cua nhan vien bat ki");
            System.out.println("4. Lay danh sach nhan vien co hon 5 nam kinh nghiem");
            System.out.println("5. Sap xep ten nhan vien tang dan");
            System.out.println("6. Xuat danh sach sinh vien");
            System.out.println("7. Thoat");
            System.out.println();
            System.out.println("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Employee e1 = new Fresher("001", new FullName("Vu", "Tran Nguyen"),
                            new GregorianCalendar(1990, 11, 12),
                            "0123456789",
                            2022, "A");
                    Employee e2 = new Fresher("002", new FullName("Phat", "Tran Ngoc"),
                            new GregorianCalendar(1989, 10, 13),
                            "0972581731",
                            2022, "A");
                    Employee e3 = new Experience("003", new FullName("Phuc", "Vo Hoang"),
                            new GregorianCalendar(1973, 7, 25),
                            "0989175684",
                            6);
                    Employee e4 = new Experience("004", new FullName("Hai", "Le Chi"),
                            new GregorianCalendar(1981, 5, 4),
                            "0293847564",
                            10);
                    Employee e5 = new Intern("005", new FullName("Tri", "Dang Huu"), new GregorianCalendar(1999, 1, 5),
                            "0192576849",
                            "Software Engineering", 3);
                    Employee e6 = new Intern("006", new FullName("Vay", "Tai Senh"), new GregorianCalendar(2000, 6, 10),
                            "0918727635",
                            "Data Science", 6);
                    Employee e7 = new Experience("007", new FullName("Hao", "Mai Nhat"),
                            new GregorianCalendar(2000, 3, 2),
                            "0123458741",
                            30);

                    ls.themNhanVien(e1);
                    ls.themNhanVien(e2);
                    ls.themNhanVien(e3);
                    ls.themNhanVien(e4);
                    ls.themNhanVien(e5);
                    ls.themNhanVien(e6);
                    ls.themNhanVien(e7);
                    break;
                case 2:
                    System.out.println("Tong so luong nhan vien tot nghiep: " + ls.demNhanVienTotNghiep());
                    break;
                case 3:
                    int date, month, year;
                    String maNV;

                    System.out.println("Nhap ma nhan vien can sua ngay sinh: ");
                    maNV = sc.nextLine();
                    System.out.println("Nhap ngay, thang, nam");
                    date = sc.nextInt();
                    month = sc.nextInt();
                    year = sc.nextInt();

                    if (ls.suaNgaySinh(maNV, new GregorianCalendar(year, month - 1, date))) {
                        System.out.println("Sua thanh cong");
                    } else {
                        System.out.println("Sua that bai");
                    }
                    break;
                case 4:
                    List<Employee> ls5Yrs = ls.getNhanVien5Yrs();

                    System.out.println("Danh sach cac nhan vien co hon 5 nam kinh nghiem: ");
                    String s = "";

                    s += String.format("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s\n", "Ma nhan vien",
                            "Ho va ten",
                            "Ngay sinh", "So dien thoai", "So nam kinh nghiem", "Nam tot nghiep", "Loai tot nghiep",
                            "Chuyen nganh",
                            "Ki dang hoc");

                    for (Employee e : ls5Yrs) {
                        s += e.toString();
                        s += "\n";
                    }

                    System.out.println(s);
                    break;
                case 5:
                    ls.sortByTen();
                    break;
                case 6:
                    System.out.println(ls);
                    break;
                case 7:
                    System.out.println("Cam on ban da su dung chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (choice != 7);
    }
}
