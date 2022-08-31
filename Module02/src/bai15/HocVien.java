package bai15;

public class HocVien {
    private double[] diemMonHoc;
    final int soLuongMonHoc = 5;
    private double diemTrungBinh;

    public HocVien() {
        this.diemMonHoc = new double[soLuongMonHoc];
    }

    public HocVien(double m1, double m2, double m3, double m4, double m5) {
        double[] d = { m1, m2, m3, m4, m5 };
        this.diemMonHoc = d;
    }

    public double tinhDiemTrungBinh() {
        double sum = 0;
        for (int i = 0; i < soLuongMonHoc - 1; i++) {
            sum += diemMonHoc[i];
        }

        return sum * 1.0 / soLuongMonHoc;
    }

    public boolean checkFail() {
        for (int i = 0; i < soLuongMonHoc - 1; i++) {
            if (diemMonHoc[i] < 5) {
                return true;
            }
        }
        return false;
    }

    public int checkConditions() {
        double dtb = tinhDiemTrungBinh();

        if (checkFail())
            return 0;

        if (dtb > 7) {
            return 1;
        } else {
            return 2;
        }
    }

    public double[] getDiemMonHoc() {
        return diemMonHoc;
    }

    public void setDiemMonHoc(double[] diemMonHoc) {
        this.diemMonHoc = diemMonHoc;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getSoLuongMonHoc() {
        return soLuongMonHoc;
    }

}
