package giaodich;

import java.util.Calendar;
import java.util.Objects;

public abstract class GiaoDich {
    protected String maGD;
    protected Calendar ngayGD;
    protected double donGia;
    protected double dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) throws Exception {
    	if (maGD != null) {
    		this.maGD = maGD;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
    	
        if (ngayGD != null) {
        	this.ngayGD = ngayGD;
        } else {
        	throw new Exception("Khong duoc null");
        }
        
        if (donGia > 0) {
        	this.donGia = donGia;
        } else {
        	throw new Exception("Phai lon hon 0");
        }
        
        if (dienTich > 0) {
        	this.dienTich = dienTich;
        } else {
        	throw new Exception("Phai lon hon 0");
        }
    }

    public abstract double getThanhTien();

    @Override
	public int hashCode() {
		return Objects.hash(maGD);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		return Objects.equals(maGD, other.maGD);
	}

	public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) throws Exception {
    	if (maGD != null) {
    		this.maGD = maGD;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
    }

    public Calendar getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Calendar ngayGD) throws Exception {
    	if (ngayGD != null) {
        	this.ngayGD = ngayGD;
        } else {
        	throw new Exception("Khong duoc null");
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) throws Exception {
    	if (donGia > 0) {
        	this.donGia = donGia;
        } else {
        	throw new Exception("Phai lon hon 0");
        }
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) throws Exception {
    	if (dienTich > 0) {
        	this.dienTich = dienTich;
        } else {
        	throw new Exception("Phai lon hon 0");
        }
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