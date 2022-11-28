package tranNguyenVu_21088201;

import java.util.Calendar;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;
	
	public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi)
			throws Exception {
		super(maGD, ngayGD, donGia, dienTich);		
		setLoaiNha(loaiNha);
		setDiaChi(diaChi);
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) throws Exception {
		if (loaiNha != null) {
			this.loaiNha = loaiNha;
		} else throw new Exception("Khong duoc rong");
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) throws Exception {
		if (loaiNha != null) {
			this.diaChi = diaChi;
		} else throw new Exception("Khong duoc rong");
	}

	@Override
	protected double getThanhTien() {
		if (getLoaiNha().equalsIgnoreCase("Cao cap")) {
			return getDienTich() * getDonGia();
		} else {
			return getDienTich() * getDonGia() * 0.9;
		}
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += String.format("%-20s|%-20s|%-20s|%-20s", "", getLoaiNha(), getDiaChi(), super.nf.format(getThanhTien()));
		
		return s;
	}
}
