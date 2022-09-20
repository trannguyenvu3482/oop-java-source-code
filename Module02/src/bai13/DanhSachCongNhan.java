package bai13;

import java.util.Scanner;

public class DanhSachCongNhan {
	private CongNhan[] DSCN;
	private int n;
	private int i = 0;
	private Scanner sc;

	// Constructor
	public DanhSachCongNhan() {
		sc = new Scanner(System.in);
		do {
			System.out.println("Nhap so luong cong nhan: ");
			n = sc.nextInt();

			if (n < 1) {
				System.out.println("So luong phai lon hon 0!");
			}
		} while (n < 1);
		DSCN = new CongNhan[n];
	}

	// Methods
	// Add CongNhan to List
	public void addCongNhan() {
		System.out.println("Nhap thong tin cong nhan moi: ");
		System.out.println("Nhap ma cong nhan: ");
		int maCN = sc.nextInt();
		System.out.println("Nhap ho cong nhan: ");
		String mHo = sc.next();
		System.out.println("Nhap ten cong nhan: ");
		String mTen = sc.next();
		System.out.println("Nhap so san pham: ");
		int mSoSP = sc.nextInt();

		// Add new CongNhan to array if array is not full and maCN is unique
		if (this.i < DSCN.length && !checkMaCN(maCN)) {
			DSCN[this.i] = new CongNhan(maCN, mHo, mTen, mSoSP);
			this.i = this.i + 1;
		} else {
			System.out.println("Khong the them cong nhan vao danh sach");
		}
	}

	// Delete CongNhan by MaCN
	public boolean deleteCongNhanByMaCN(int maCN) {
		int res = findCongNhanByMaCN(maCN);

		if (res != -1) {
			if (this.i == 1) {
				System.out.println("Da xoa CN " + DSCN[res].getMaCN());
				this.i = this.i - 1;
				DSCN = new CongNhan[n];
				return true;
			} else {
				System.out.println("Da xoa CN " + DSCN[res].getMaCN());
				for (int j = res; j < this.i - 1; j++) {
					DSCN[j] = DSCN[j + 1];
				}
				this.i = this.i - 1;
				return true;
			}
		} else {
			System.out.println("Khong ton tai CN co maCN day!");
			return false;
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

	// Output all CongNhan in the list
	public void outputDSCN() {
		System.out.println("Danh sach cong nhan: ");
		System.out.println(
				String.format("%-20s %-20s %-20s %-20s", "Ma cong nhan", "Ho va ten CN", "So san pham", "Tien luong"));
		for (int j = 0; j < this.i; j++) {
			System.out.println(DSCN[j].toString());
		}
	}

	// Output number of CongNhan in the list
	public void outputSoLuong() {
		System.out.println("So luong cong nhan: " + this.i);
	}

	// Output all CongNhan have mSoSP > 200
	public void outputDSCN_mSoSP() {
		System.out.println("Danh sach cong nhan co so san pham lon hon 200: ");
		System.out.println(
				String.format("%-20s %-20s %-20s %-20s", "Ma cong nhan", "Ho va ten CN", "So san pham", "Tien luong"));
		for (int j = 0; j < this.i; j++) {
			if (DSCN[j].getmSoSP() > 200) {
				System.out.println(DSCN[j].toString());
			}
		}
	}

	// Sort all CongNhan by mSoSP
	public void sortDSCN() {
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
