package tranNguyenVu_21088201;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

public class DanhSachGiaoDich {
	List<GiaoDich> ls;

	public DanhSachGiaoDich() {
		ls = new ArrayList<GiaoDich>();
	}
	
	public boolean themGiaoDich(GiaoDich g) {
		if (ls.contains(g)) {
			return false;
		} else {
			return ls.add(g);			
		}
	}
	
	public boolean xoaGiaoDich(String maGD) {
		for (GiaoDich g : ls) {
			if (g.getMaGD().equals(maGD)) {
				return ls.remove(g);
			}
		}
		
		return false;
	}
	
	public int getSoLuongGD() {
		return ls.size();
	}
	
	public void printTongDoanhThu() {
		// Khai bao mang thanh tien 12 thang
		double[] listDT = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		// Cong don thanh tien theo thang
		for (GiaoDich g : ls) {
			listDT[g.getNgayGD().get(Calendar.MONTH)] += g.getThanhTien();
		}
		
		// Xuat ra
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		
		System.out.println("Tong doanh thu moi thang: ");
		for (int i = 0; i < listDT.length; i++) {
			System.out.println("Doanh thu thang " + (i + 1) + " : " + nf.format(listDT[i]));
		}
	}
	
	public void sapXepTheoMa() {
		Collections.sort(ls, new Comparator<GiaoDich>() {
			@Override
			public int compare(GiaoDich o1, GiaoDich o2) {
				return o1.getMaGD().compareTo(o2.getMaGD());
			}
		});
	}
	
	public void xuatTheoNgay() {
		List<GiaoDich> lsThang = new ArrayList<GiaoDich>();
		
		// Tim giao dich 28/11/22
		for (GiaoDich g : ls) {
			if (g.getNgayGD().getTime().equals((new GregorianCalendar(2022, 10, 28).getTime()))) {
				lsThang.add(g);
			}
		}
		
		// Tim giao dich thanh tien cao nhat cua list tren
		GiaoDich gdMax = lsThang.get(0);
		for (GiaoDich g : lsThang) {
			if (g.getThanhTien() > gdMax.getThanhTien()) {
				gdMax = g;
			}
		}
		
		// Xuat ra
		System.out.println("Danh sach theo ngay 28/11/2022: ");
		System.out.println(String.format("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s", "Ma GD", "Ngay GD", "Don gia", "Dien tich", "Loai dat", "Loai nha", "Dia chi", "Thanh tien"));
		for (GiaoDich g : lsThang) {
			System.out.println(g);
		}
		
		System.out.println("Thanh tien lon nhat trong ngay 28/11/2022: ");
		System.out.println(String.format("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s", "Ma GD", "Ngay GD", "Don gia", "Dien tich", "Loai dat", "Loai nha", "Dia chi", "Thanh tien"));
		System.out.println(gdMax);
	}
	
	@Override
	public String toString() {
		String s = "";
		
		s += String.format("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s\n", "Ma GD", "Ngay GD", "Don gia", "Dien tich", "Loai dat", "Loai nha", "Dia chi", "Thanh tien");
		
		for (GiaoDich g : ls) {
			s += g.toString();
			s += "\n";
		}
		return s;
	}
}
