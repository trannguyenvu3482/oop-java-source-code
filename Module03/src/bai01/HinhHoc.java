package bai01;

public abstract class HinhHoc {
    private String tenHinh;
    private double chuVi;
    private double dienTich;

    public HinhHoc() {
    }

    public HinhHoc(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
}
