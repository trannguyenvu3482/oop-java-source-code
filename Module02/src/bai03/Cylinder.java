package bai03;

import java.text.DecimalFormat;

public class Cylinder {
    private double banKinh;
    private double chieuCao;

    DecimalFormat df = new DecimalFormat("#.00");

    public Cylinder() {
    }

    public Cylinder(double banKinh, double chieuCao) {
        this.banKinh = banKinh;
        this.chieuCao = chieuCao;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getDienTichXungQuanh() {
        return Math.PI * banKinh * banKinh * chieuCao;
    }

    public double getDienTichToanPhan() {
        return 2 * Math.PI * banKinh * banKinh + 2 * Math.PI * banKinh * chieuCao;
    }

    public double getTheTich() {
        return Math.PI * banKinh * banKinh * chieuCao * chieuCao;
    }

    @Override
    public String toString() {
        return "Hinh tru: " + "\n" +
                "banKinh=" + banKinh + "\n" +
                "chieuCao=" + chieuCao + "\n" +
                "dienTichXungQuanh=" + df.format(getDienTichXungQuanh()) + "\n" +
                "dienTichToanPhan=" + df.format(getDienTichToanPhan()) + "\n" +
                "theTich=" + df.format(getTheTich());
    }
}
