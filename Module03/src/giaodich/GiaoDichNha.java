package giaodich;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) throws Exception {
        super(maGD, ngayGD, donGia, dienTich);
        
        if (loaiNha != null) {
        	this.loaiNha = loaiNha;
        } else {
        	throw new Exception("Khong duoc rong");
        }
        
        if (diaChi != null) {
        	this.diaChi = diaChi;
        } else {
        	throw new Exception("Khong duoc rong");
        }
    }

    @Override
    public double getThanhTien() {
        return donGia * dienTich;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) throws Exception {
    	if (loaiNha != null) {
        	this.loaiNha = loaiNha;
        } else {
        	throw new Exception("Khong duoc rong");
        }
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
    	if (diaChi != null) {
        	this.diaChi = diaChi;
        } else {
        	throw new Exception("Khong duoc rong");
        }
    }

    @Override
    public String toString() {
    	Locale lc = new Locale("vi", "VN");
    	DateFormat df = DateFormat.getDateInstance(3, lc);
    	NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
    	return String.format("|%-10s|%-20s|%-20s|%-20s|%-20s|%-20s|%-10s|%-10s|", getMaGD(), df.format(getNgayGD().getTime()), nf.format(getThanhTien()), "", getLoaiNha(), getDiaChi(), getDienTich(), "GD nha");
    }
}