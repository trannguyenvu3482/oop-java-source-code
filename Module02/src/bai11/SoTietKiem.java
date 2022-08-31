package bai11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
    private String maSo;
    private LocalDate ngayMoSo;
    private double soTienGui;
    private int kyHan;
    private double laiSuat;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DecimalFormat df = new DecimalFormat("#,###.##");

    public SoTietKiem() {
    }

    public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGui, int kyHan, double laiSuat) {
        this.maSo = maSo;
        this.ngayMoSo = ngayMoSo;
        this.soTienGui = soTienGui;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }

    public int tinhSoThangGuiThuc() {
        Period age = Period.between(ngayMoSo, LocalDate.now());
        int yearsBetween = age.getYears();
        int monthsBetween = age.getMonths();
        int monthsSent = yearsBetween * 12 + monthsBetween;

        if (monthsSent % kyHan == 0) {
            return monthsSent;
        } else {
            return monthsSent / kyHan * kyHan;
        }
    }

    public double tinhTienLai() {
        return soTienGui * Math.pow(1 + laiSuat, tinhSoThangGuiThuc());
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public LocalDate getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(LocalDate ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    @Override
    public String toString() {
        return "STK " + maSo + "[" + dtf.format(ngayMoSo) + "-" + dtf.format(LocalDate.now()) + "]KH " + kyHan
                + " thang, so thang tinh lai: "
                + tinhSoThangGuiThuc() + " lai suat " + laiSuat + ", so tien: " + df.format(soTienGui) + " --> "
                + df.format(tinhTienLai() - soTienGui);
    }
}
