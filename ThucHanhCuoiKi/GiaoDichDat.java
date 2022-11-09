package tranNguyenVu_21088201;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;

	public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiDat) throws Exception {
		super(maGD, ngayGD, donGia, dienTich);
		setLoaiDat(loaiDat);
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) throws Exception {
		if (loaiDat != null) {
			this.loaiDat = loaiDat;
		} else throw new Exception("Khong duoc rong");
	}
	
	@Override
	protected double getThanhTien() {
		if (getLoaiDat().equalsIgnoreCase("B") || getLoaiDat().equalsIgnoreCase("C")) {
			return getDienTich() * getDonGia();
		} else {
			return getDienTich() * getDonGia() * 1.5;
		}
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += String.format("%-20s|%-20s|%-20s|%-20s", getLoaiDat(), "", "", super.nf.format(getThanhTien()));
		
		return s;
	}
}
