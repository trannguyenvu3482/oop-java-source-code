package bai10;

public class TestLHPSinhVien {
    public static void main(String[] args) {
        LopHocPhan lhp = new LopHocPhan("123456", "LT Huong doi tuong", "Co Ha", "Thu 7, tiet 4-6, phong A1.1",
                new SinhVien[] { new SinhVien("123", "Nguyen Van A"), new SinhVien("543", "Le Thi B"),
                        new SinhVien("321", "Luong Van C") });

        System.out.println("Thong tin lop hoc phan: ");
        System.out.println("- Ma LHP: " + lhp.getMaLHP());
        System.out.println("- Ten LHP: " + lhp.getTenLHP());
        System.out.println("- GV giang day: " + lhp.getTenGV());
        System.out.println("- Thong tin buoi hoc: " + lhp.getThongTinLopHoc());

        System.out.println("Danh sach sinh vien: ");
        for (int i = 0; i < lhp.getSoLuongSV(); i++) {
            System.out.println("\t" + lhp.getDsSV()[i].getMaSV() + " | " + lhp.getDsSV()[i].getHoTen());
        }
        System.out.println("Tong so sinh vien: " + lhp.getSoLuongSV());
    }
}
