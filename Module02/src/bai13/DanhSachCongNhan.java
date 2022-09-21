package bai13;

public class DanhSachCongNhan {
	final int MAX = 100;
	private CongNhan[] DSCN;
	private int n; // So phan tu toi da luc khoi tao
	private int i = 0; // So cong nhan hien tai co trong danh sach

	// Constructor
	public DanhSachCongNhan(int size) {
		if (size < 5 || size > MAX) {
			System.err.println("So luong cong nhan it nhat phai la 5");
		} else {
			DSCN = new CongNhan[size];
			n = size;
		}
	}

	// Add CongNhan to List
	public boolean addCongNhan(CongNhan addCN) throws Exception {
		// Add new CongNhan to array if array is not full and maCN is unique
		if (i < n) {
			if (!checkMaCN(addCN.getMaCN())) {
				try {
					DSCN[i] = addCN;
					i = i + 1;
					return true;
				} catch (Exception e) {
					throw e;
				}

			} else {
				throw new Exception("Ma cong nhan da ton tai");
			}
		} else {
			throw new Exception("Danh sach da day");
		}
	}

	// Delete CongNhan by MaCN
	public void deleteCongNhanByMaCN(int maCN) throws Exception {
		if (this.i == 0) {
			throw new Exception("Danh sach cong nhan dang rong");
		}

		int res = findCongNhanByMaCN(maCN);

		if (res != -1) {
			if (this.i == 1) {
				System.out.println("Da xoa CN " + DSCN[res].getMaCN());
				this.i = this.i - 1;
				DSCN = new CongNhan[n];
			} else {
				System.out.println("Da xoa CN " + DSCN[res].getMaCN());
				for (int j = res; j < this.i - 1; j++) {
					DSCN[j] = DSCN[j + 1];
				}
				this.i = this.i - 1;
			}
		} else {
			throw new Exception("Khong ton tai CN co maCN day!");
		}
	}

	// Find a CongNhan by maCN, return index
	public int findCongNhanByMaCN(int maCN) {
		if (this.i == 0)
			return -1;

		for (int j = 0; j < this.i; j++) {
			if (DSCN[j].getMaCN() == maCN) {
				return j;
			}
		}
		return -1;
	}

	// Check if maCN is already in the list, return boolean
	public boolean checkMaCN(int maCN) {
		if (this.i == 0)
			return false;

		for (int j = 0; j < this.i; j++) {
			if (DSCN[j].getMaCN() == maCN) {
				return true;
			}
		}
		return false;
	}

	// Output number of CongNhan in the list
	public void outputSoLuong() throws Exception {
		if (this.i == 0) {
			throw new Exception("Danh sach cong nhan dang rong");
		} else {
			System.out.println("So luong cong nhan: " + this.i);
		}
	}

	// Output all CongNhan have mSoSP > 200
	public void outputDSCN_mSoSP() throws Exception {
		if (this.i == 0) {
			throw new Exception("Danh sach cong nhan dang rong");
		} else {
			System.out.println("Danh sach cong nhan co so san pham lon hon 200: ");
			System.out.println(String.format("%-20s|%-20s|%-20s|%-20s|", "Ma cong nhan", "Ho va ten CN", "So san pham",
					"Tien luong"));
			for (int j = 0; j < this.i; j++) {
				if (DSCN[j].getmSoSP() > 200) {
					System.out.println(DSCN[j].toString());
				}
			}
		}
	}

	// Sort all CongNhan by mSoSP
	public void sortDSCN() throws Exception {

		if (this.i == 0) {
			throw new Exception("Danh sach cong nhan dang rong");
		} else {
			for (int j = 0; j < this.i; j++) {
				for (int k = j + 1; k < this.i; k++) {
					if (DSCN[j].getmSoSP() < DSCN[k].getmSoSP()) {
						CongNhan temp = DSCN[j];
						DSCN[j] = DSCN[k];
						DSCN[k] = temp;
					}
				}
			}
		}
	}

	// Output all CongNhan in the list
	@Override
	public String toString() {
		if (this.i == 0) {
			return "Danh sach cong nhan dang rong!";
		} else {
			System.out.println("Danh sach cong nhan: ");
			System.out.println(String.format("%-20s|%-20s|%-20s|%-20s|", "Ma cong nhan", "Ho va ten CN", "So san pham",
					"Tien luong"));
			for (int j = 0; j < this.i; j++) {
				System.out.println(DSCN[j]);
			}
			return "";
		}

	}

}
