package giaodich;

import java.util.Calendar;

public class EntryGiaoDich {
    public static void main(String[] args) {
        GiaoDichNha gdNha = new GiaoDichNha();
        gdNha.setMaGD("GD001");
        gdNha.setNgayGD(Calendar.getInstance());
        gdNha.setDonGia(100);
        gdNha.setDienTich(100);
        gdNha.setLoaiNha("Nha 1");
        gdNha.setDiaChi("Dia chi nha 1");
        System.out.println(gdNha.toString());
        gdNha.tieuDeGDN();
        System.out.println(gdNha.getThanhTien());
    }
}
