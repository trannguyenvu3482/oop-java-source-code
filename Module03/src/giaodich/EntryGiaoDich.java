package giaodich;

import java.util.GregorianCalendar;

public class EntryGiaoDich {
	public static void inTieuDe() {
		for (int i = 1; i < 140; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-10s|%-20s|%-20s|%-20s|%-20s|%-20s|%-10s|%-10s|", "Ma GD", "Ngay GD", "Don gia", "Loai dat", "Loai nha", "Dia chi", "Dien tich", "Loai GD");
		System.out.println();
	}
	
    public static void main(String[] args) throws Exception {
    	ListGiaoDich lsgd = new ListGiaoDich();
    	// Tao giao dich dat
    	GiaoDich gd1 = new GiaoDichDat("001", new GregorianCalendar(2022, 5, 23), 5000, 600, "A");
    	GiaoDich gd2 = new GiaoDichDat("002", new GregorianCalendar(2022, 7, 23), 4000, 600, "A");
    	GiaoDich gd3 = new GiaoDichDat("003", new GregorianCalendar(2022, 6, 23), 6000, 600, "A");
    	
    	// Tao giao dich nha
    	GiaoDich gd4 = new GiaoDichNha("004", new GregorianCalendar(2022, 5, 23), 70000, 400, "Cao cap", "3 Huynh Van Nghe");
    	GiaoDich gd5 = new GiaoDichNha("005", new GregorianCalendar(2022, 10, 24), 6000, 300, "Thuong", "120 Phan Van Tri");
    	GiaoDich gd6 = new GiaoDichNha("006", new GregorianCalendar(2022, 8, 25), 300000, 200, "Cao Cap", "3 Huynh Van Banh");
    	
    	// Them cac giao dich vao list
    	lsgd.themGiaoDich(gd1);
    	lsgd.themGiaoDich(gd2);
    	lsgd.themGiaoDich(gd3);
    	lsgd.themGiaoDich(gd4);
    	lsgd.themGiaoDich(gd5);
    	lsgd.themGiaoDich(gd6);
    	
    	// Xoa giao dich co ma "006"
    	lsgd.xoaGiaoDich("006");
    	
    	// In cac giao dich
    	inTieuDe();
    	lsgd.inGiaoDich();
    	
    	// In thanh tien trung binh, dem tong so luong cua tung loai
    	System.out.println("Tong so giao dich dat: " + lsgd.countGDD());
    	System.out.println("Tong so giao dich nha: " + lsgd.countGDN());
    	System.out.println("Thanh tien trung binh cua giao dich dat la: " + lsgd.avgThanhTien());
    }
}