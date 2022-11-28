public class NhanVat extends NguoiChoi {
    private String monPhai;

    public NhanVat() {
    }

    public NhanVat(int capDo, double mucSatThuong, String monPhai) {
        super(capDo, mucSatThuong);
        this.monPhai = monPhai;
    }

    public String getMonPhai() {
        return monPhai;
    }

    public void setMonPhai(String monPhai) {
        this.monPhai = monPhai;
    }

    @Override
    public String toString() {
        String s = super.toString();

        s += String.format("%-20s|", monPhai);

        return s;
    }
}
