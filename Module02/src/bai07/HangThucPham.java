<<<<<<< HEAD
package bai07;

import java.time.LocalDate;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    // Attributes
    private String maHang;
    private String tenHang;
    private int donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    DecimalFormat df = new DecimalFormat("#,##0.00");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Constructor
    public HangThucPham() {
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
    }

    public HangThucPham(String maHang) throws Exception {
        setMaHang(maHang);
        setTenHang("xxx");
        setDonGia(0);
    }

    public HangThucPham(String maHang, String tenHang, int donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan)
            throws Exception {
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    // Getters and setters
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) throws Exception {
        if (!maHang.trim().equals("")) {
            this.maHang = maHang;
        } else {
            throw new Exception("Ma hang khong duoc rong");
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang.length() > 0) {
            this.tenHang = tenHang;
        }
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        System.out.println(ngaySanXuat);
        System.out.println(this.ngayHetHan);
        // if (ngaySanXuat.isBefore(this.ngayHetHan)) {
        this.ngaySanXuat = ngaySanXuat;
        // }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        // if (ngayHetHan.isAfter(this.ngaySanXuat)) {
        this.ngayHetHan = ngayHetHan;
        // }
    }

    // Methods
    public boolean isHetHan() {
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10s %-10s %-10s %-10s", maHang, tenHang, df.format(donGia),
                dtf.format(ngaySanXuat), dtf.format(ngayHetHan), isHetHan() ? "Hang het han" : "");
    }
}
=======
package bai07;

import java.time.LocalDate;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    // Attributes
    private String maHang;
    private String tenHang;
    private int donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    DecimalFormat df = new DecimalFormat("#,##0.00");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Constructor
    public HangThucPham() {
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
    }

    public HangThucPham(String maHang) throws Exception {
        setMaHang(maHang);
        setTenHang("xxx");
        setDonGia(0);
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
    }

    public HangThucPham(String maHang, String tenHang, int donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan)
            throws Exception {
    	this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    // Getters and setters
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) throws Exception {
        if (!maHang.trim().equals("")) {
            this.maHang = maHang;
        } else {
            throw new Exception("Ma hang khong duoc rong");
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang.length() > 0) {
            this.tenHang = tenHang;
        }
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
    	if (ngaySanXuat.isBefore(this.ngayHetHan)) {
        this.ngaySanXuat = ngaySanXuat;
         }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
         if (ngayHetHan.isAfter(this.ngaySanXuat)) {
        this.ngayHetHan = ngayHetHan;
         }
    }

    // Methods
    public boolean isHetHan() {
        return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }

    @Override
    public String toString() {
        return String.format("|%-10s| %-15s| %-20s| %-20s| %-20s| %-20s|", maHang, tenHang, df.format(donGia),
                dtf.format(ngaySanXuat), dtf.format(ngayHetHan), isHetHan() ? "Hang het han" : "");
    }
}
>>>>>>> branch 'master' of https://github.com/trannguyenvu3482/oop-java-source-code.git
