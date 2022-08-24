package bai11;

public class KhachHang {
    private String maKH;
    private String hoTenKH;
    private SoTietKiem[] dsSoTietKiem;
    private int soLuongSoHienCo;

    public KhachHang() {
        this.maKH = "";
        this.hoTenKH = "";
        this.dsSoTietKiem = new SoTietKiem[100]; // 100 la so luong toi da so tiet kiem ma khach hang co the mo
        this.soLuongSoHienCo = 0;
    }

    public KhachHang(String maKH, String hoTenKH, SoTietKiem[] dsSoTietKiem, int soLuongSoHienCo) {
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        this.dsSoTietKiem = dsSoTietKiem;
        this.soLuongSoHienCo = soLuongSoHienCo;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public SoTietKiem[] getDsSoTietKiem() {
        return dsSoTietKiem;
    }

    public int getSoLuongSoHienCo() {
        return soLuongSoHienCo;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public void setDsSoTietKiem(SoTietKiem[] dsSoTietKiem) {
        this.dsSoTietKiem = dsSoTietKiem;
    }

    public void setSoLuongSoHienCo(int soLuongSoHienCo) {
        this.soLuongSoHienCo = soLuongSoHienCo;
    }

    public void themSoTietKiem(SoTietKiem soTietKiem) {
        if (soLuongSoHienCo < dsSoTietKiem.length) {
            dsSoTietKiem[soLuongSoHienCo] = soTietKiem;
            soLuongSoHienCo++;
        }
    }

}
