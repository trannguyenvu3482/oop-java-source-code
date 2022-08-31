package bai13;

public class CongNhan {
    private int maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public CongNhan() {
    }

    public CongNhan(int maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        if (maCN > 0) {
            this.maCN = maCN;
        }
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        if (mHo.length() > 0) {
            this.mHo = mHo;
        }
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        if (mTen.length() > 0) {
            this.mTen = mTen;
        }
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        if (mSoSP > 0) {
            this.mSoSP = mSoSP;
        }
    }

    // Methods
    public double tinhLuong() {
        if (mSoSP < 200) {
            return mSoSP * 0.5;
        } else if (mSoSP < 400) {
            return mSoSP * 0.55;
        } else if (mSoSP < 600) {
            return mSoSP * 0.6;
        } else {
            return mSoSP * 0.65;
        }
    }

    @Override
    public String toString() {
        return String.format("%-20d %-20s %-20d %-20f", maCN, mHo + mTen, mSoSP, tinhLuong());
    }
}