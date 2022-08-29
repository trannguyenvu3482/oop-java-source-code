package bai01;

public class HìnhTron extends HinhHoc {
    private double banKinh;

    public HìnhTron() {
    }

    public HìnhTron(String tenHinh, double banKinh) {
        super(tenHinh);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HìnhTron{" +
                "banKinh=" + banKinh +
                ", chuVi=" + chuVi +
                ", dienTich=" + dienTich +
                '}';
    }
}
