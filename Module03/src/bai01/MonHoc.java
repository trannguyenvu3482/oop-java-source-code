package bai01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MonHoc {
    private String maMH;
    private String tenMonHoc;
    private Date ngayMoLop;
    private String hoTenGV;

    public MonHoc() {

    }

    public MonHoc(String maMH, String tenMonHoc, Date ngayMoLop, String hoTenGV) {
        this.maMH = maMH;
        this.tenMonHoc = tenMonHoc;
        this.ngayMoLop = ngayMoLop;
        this.hoTenGV = hoTenGV;
    }

    public String NhapHoc() {
        return "Da nhap hoc thanh cong";
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public Date getNgayMoLop() {
        return ngayMoLop;
    }

    public void setNgayMoLop(Date ngayMoLop) {
        this.ngayMoLop = ngayMoLop;
    }

    public String getHoTenGV() {
        return hoTenGV;
    }

    public void setHoTenGV(String hoTenGV) {
        this.hoTenGV = hoTenGV;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("|%-10s|%-20s|%-11s", getMaMH(), getTenMonHoc(), sdf.format(getNgayMoLop()));
    }

}
