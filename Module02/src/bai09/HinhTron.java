package bai09;

public class HinhTron {
    private ToaDo tam;
    private double banKinh;

    public HinhTron() {
        tam = new ToaDo();
        banKinh = 0;
    }

    public HinhTron(ToaDo tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    // Getter and Setter
    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Methods
    public double tinhDienTich() {
        return 3.14 * banKinh * banKinh;
    }

    public double tinhChuVi() {
        return 2 * 3.14 * banKinh;
    }

    // toString
    @Override
    public String toString() {
        return "Hinh tron co tam " + tam.toString() + " voi ban kinh " + banKinh
                + " co dien tich va chu vi lan luot la " + tinhDienTich() + " va " + tinhChuVi();
    }
}
