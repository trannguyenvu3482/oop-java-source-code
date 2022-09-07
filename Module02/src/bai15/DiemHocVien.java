package bai15;

public class DiemHocVien {
    private int soLuongLamLuanVan;
    private int soLuongThiTotNghiep;
    private int soLuongThiLai;
    private HocVien[] danhSachHocVien;
    private int soLuongHocVien;

    public DiemHocVien() {
        this.soLuongLamLuanVan = 0;
        this.soLuongThiTotNghiep = 0;
        this.soLuongThiLai = 0;
        this.danhSachHocVien = new HocVien[100];
        this.soLuongHocVien = 0;
    }

    public void countSoLuong() {
        if (soLuongHocVien == 0)
            return;

        for (int i = 0; i < soLuongHocVien; i++) {

            switch (danhSachHocVien[i].checkConditions()) {
                case 0:
                    soLuongThiLai++;
                    break;
                case 1:
                    soLuongLamLuanVan++;
                    break;
                case 2:
                    soLuongThiTotNghiep++;
                    break;
                default:
                    break;
            }
        }
    }

    public void themDiemHocVien(HocVien hv) {
        if (soLuongHocVien < 100) {
            soLuongHocVien++;
            danhSachHocVien[soLuongHocVien - 1] = hv;
        }
    }

    public int getSoLuongLamLuanVan() {
        return soLuongLamLuanVan;
    }

    public void setSoLuongLamLuanVan(int soLuongLamLuanVan) {
        this.soLuongLamLuanVan = soLuongLamLuanVan;
    }

    public int getSoLuongThiTotNghiep() {
        return soLuongThiTotNghiep;
    }

    public void setSoLuongThiTotNghiep(int soLuongThiTotNghiep) {
        this.soLuongThiTotNghiep = soLuongThiTotNghiep;
    }

    public void setSoLuongThiLai(int soLuongThiLai) {
        this.soLuongThiLai = soLuongThiLai;
    }

    public int getSoLuongThiLai() {
        return soLuongThiLai;
    }

    @Override
    public String toString() {
        System.out.println("Lop hoc DHKHDL17A:");
        System.out.println("So luong sinh vien lam luan van: " + soLuongLamLuanVan);
        System.out.println("So luong sinh vien thi tot nghiep: " + soLuongThiTotNghiep);
        System.out.println("So luong sinh vien thi lai: " + soLuongThiLai);
        return "";
    }
}
