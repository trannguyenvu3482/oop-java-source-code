public abstract class NguoiChoi {
    protected int capDo;
    protected double mucSatThuong;

    public NguoiChoi() {
    }

    public NguoiChoi(int capDo, double mucSatThuong) {
        this.capDo = capDo;
        this.mucSatThuong = mucSatThuong;
    }

    public int getCapDo() {
        return capDo;
    }

    public void setCapDo(int capDo) {
        this.capDo = capDo;
    }

    public double getMucSatThuong() {
        return mucSatThuong;
    }

    public void setMucSatThuong(double mucSatThuong) {
        this.mucSatThuong = mucSatThuong;
    }

    @Override
    public String toString() {
        String s = "";
        s += String.format("%-20d|%-20.0f|", capDo, mucSatThuong);
        
        return s;
    }
}
