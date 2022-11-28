public class QuaiVat extends NguoiChoi {
    private String hanhQV;
    private String loaiQV;

    public QuaiVat() {
    }

    public QuaiVat(int capDo, double mucSatThuong, String hanhQV, String loaiQV) {
        super(capDo, mucSatThuong);
        this.hanhQV = hanhQV;
        this.loaiQV = loaiQV;
    }

    public String getHanhQV() {
        return hanhQV;
    }

    public void setHanhQV(String hanhQV) {
        this.hanhQV = hanhQV;
    }

    public String getLoaiQV() {
        return loaiQV;
    }

    public void setLoaiQV(String loaiQV) {
        this.loaiQV = loaiQV;
    }

    @Override
    public String toString() {
        String s = super.toString();

        s += String.format("%-20s|%-20s|", hanhQV, loaiQV);

        return s;
    }
}
