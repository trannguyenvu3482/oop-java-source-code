package bai13;

public class CongNhan {
	private int maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;

	public CongNhan() {
	}

	public CongNhan(int maCN, String mHo, String mTen, int mSoSP) throws Exception {
		if (maCN > 0) {
			this.maCN = maCN;
		} else {
			throw new Exception("Ma cong nhan phai > 0");
		}

		if (mHo.length() > 0) {
			this.mHo = mHo;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}

		if (mTen.length() > 0) {
			this.mTen = mTen;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}

		if (mSoSP > 0) {
			this.mSoSP = mSoSP;
		} else {
			throw new Exception("So SP phai > 0");
		}
	}

	public int getMaCN() {
		return maCN;
	}

	public void setMaCN(int maCN) throws Exception {
		if (maCN > 0) {
			this.maCN = maCN;
		} else {
			throw new Exception("Ma cong nhan phai > 0");
		}
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) throws Exception {
		if (mHo.length() > 0) {
			this.mHo = mHo;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) throws Exception {
		if (mTen.length() > 0) {
			this.mTen = mTen;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) throws Exception {
		if (mSoSP > 0) {
			this.mSoSP = mSoSP;
		} else {
			throw new Exception("So SP phai > 0");
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