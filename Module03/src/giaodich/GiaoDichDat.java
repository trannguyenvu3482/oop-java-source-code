package giaodich;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiDat) throws Exception {
        super(maGD, ngayGD, donGia, dienTich);
        
        if (loaiDat != null) {
        	this.loaiDat = loaiDat;
        } else {
        	throw new Exception("Khong duoc rong");
        }
    }

    @Override
    public double getThanhTien() {
        return donGia * dienTich;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) throws Exception {
    	if (loaiDat != null) {
        	this.loaiDat = loaiDat;
        } else {
        	throw new Exception("Khong duoc rong");
        }
    }

    @Override
    public String toString() {
    	Locale lc = new Locale("vi", "VN");
    	DateFormat df = DateFormat.getDateInstance(3, lc);
    	NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
    	return String.format("|%-10s|%-20s|%-20s|%-20s|%-20s|%-20s|%-10s|%-10s|", getMaGD(), df.format(getNgayGD().getTime()), nf.format(getThanhTien()), getLoaiDat(), "", "", getDienTich(), "GD dat");
    }
}