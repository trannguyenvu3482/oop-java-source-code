package bai11;

import java.time.LocalDate;

public class SoTietKiem {
    private String maSo;
    private LocalDate ngayMoSo;
    private double soTienGui;
    private int kyHan;
    private float laiSuat;

    public SoTietKiem() {
    }

    public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGui, int kyHan, float laiSuat) {
        this.maSo = maSo;
        this.ngayMoSo = ngayMoSo;
        this.soTienGui = soTienGui;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }
}
