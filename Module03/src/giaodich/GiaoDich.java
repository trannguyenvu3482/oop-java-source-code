package giaodich;

import java.util.Calendar;

public abstract class GiaoDich {
    protected String maGD;
    protected Calendar ngayGD;
    protected double donGia;
    protected double dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public abstract double getThanhTien();

    public void tieuDeGDD() {
        System.out.println("Mã giao dịch: " + maGD);
        System.out.println("Ngày giao dịch: " + ngayGD.get(Calendar.DAY_OF_MONTH) + "/" + ngayGD.get(Calendar.MONTH)
                + "/" + ngayGD.get(Calendar.YEAR));
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Thành tiền: " + getThanhTien());
    }

    public void tieuDeGDN() {
        System.out.println("Mã giao dịch: " + maGD);
        System.out.println("Ngày giao dịch: " + ngayGD.get(Calendar.DAY_OF_MONTH) + "/" + ngayGD.get(Calendar.MONTH)
                + "/" + ngayGD.get(Calendar.YEAR));
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Thành tiền: " + getThanhTien());
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public Calendar getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Calendar ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGD='" + maGD + '\'' +
                ", ngayGD=" + ngayGD +
                ", donGia=" + donGia +
                ", dienTich=" + dienTich +
                '}';
    }
}
