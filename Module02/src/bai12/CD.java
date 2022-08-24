package bai12;

public class CD {
    private int maCd;
    private String tuaCd;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
        maCd = 999999;
        tuaCd = "Chua xac dinh";
    }

    public CD(int maCd, String tuaCd, int soBaiHat, double giaThanh) {
        this.maCd = maCd;
        this.tuaCd = tuaCd;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCd() {
        return maCd;
    }

    public void setMaCd(int maCd) {
        if (maCd > 0) {
            this.maCd = maCd;
        }
    }

    public String getTuaCd() {
        return tuaCd;
    }

    public void setTuaCd(String tuaCd) {
        if (tuaCd.length() > 0) {
            this.tuaCd = tuaCd;
        }
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        }
    }

    @Override
    public String toString() {
        return String.format("%-20d%-20s%-20d%-20.2f", maCd, tuaCd, soBaiHat, giaThanh);
    }
}
