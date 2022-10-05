package giaodich;

import java.util.ArrayList;
import java.util.List;

public class ListGiaoDich {
	List<GiaoDich> ls;

	public ListGiaoDich() {
		ls = new ArrayList<GiaoDich>(10);
	}
	
	public boolean themGiaoDich(GiaoDich g) {
		if (ls.contains(g)) {
			return false;
		} else {
			return ls.add(g);
		}
	}
	
	public void inGiaoDich() {
		for (GiaoDich g : ls) {
			System.out.println(g);
		}
	}
	
	public GiaoDich timGiaoDich(String maGD) {
		for (GiaoDich g: ls) {
			if (g.getMaGD().equalsIgnoreCase(maGD)) {
				return g;
			}
		}
		
		return null;
	}
	
	public double avgThanhTien() {
		double sum = 0;
		for (GiaoDich g : ls) {
			if (g instanceof GiaoDichDat) {
				sum += g.getThanhTien();
			}
		}
		
		return (double)sum / ls.size();
	}

	public int countGDD() {
		int count = 0;
		for (GiaoDich g : ls) {
			if (g instanceof GiaoDichDat) {
				count++;
			}
		}

		return count;
	}
	
	public int countGDN() {
		int count = 0;
		for (GiaoDich g : ls) {
			if (g instanceof GiaoDichNha) {
				count++;
			}
		}

		return count;
	}
	
	public boolean xoaGiaoDich(String maGD) {
		GiaoDich g = timGiaoDich(maGD);

		if (g != null) {
			return ls.remove(g);
		} else {
			return false;
		}
	}
	
}
