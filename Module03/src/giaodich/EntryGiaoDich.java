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
        System.out.println(gdNha.getThanhTien());

        GiaoDichDat gdDat = new GiaoDichDat();
        gdDat.setMaGD("GD002");
        gdDat.setNgayGD(Calendar.getInstance());
        gdDat.setDonGia(100);
        gdDat.setDienTich(100);
        gdDat.setLoaiDat("Dat 1");
        System.out.println(gdDat.toString());
        System.out.println(gdDat.getThanhTien());
    }
}
