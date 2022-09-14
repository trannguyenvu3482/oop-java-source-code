package bai12;

import java.util.Scanner;

public class CDList {
	// Create a array of CD with n elements
	private CD[] CDList;
	private int n; // n is maximum amount of CDs
	private int i = 0;
	private Scanner sc;

	// Constructor
	public CDList() {
		sc = new Scanner(System.in);
		System.out.println("Nhap so luong CD: ");
		n = sc.nextInt();
		CDList = new CD[n];
	}

	// Methods
	// Add CD to List
	public void addCD() {
		System.out.println("Nhap thong tin CD moi: ");
		System.out.println("Nhap ma CD: ");
		int maCd = sc.nextInt();
		System.out.println("Nhap tua CD: ");
		String tuaCd = sc.next();
		System.out.println("Nhap so bai hat: ");
		int soBaiHat = sc.nextInt();
		System.out.println("Nhap gia thanh: ");
		double giaThanh = sc.nextDouble();

		// Add new CD to array if array is not full and maCd is unique
		if (this.i < CDList.length && checkMaCd(maCd) == false) {
			CDList[this.i] = new CD(maCd, tuaCd, soBaiHat, giaThanh);
			this.i = this.i + 1;
		} else {
			System.out.println("Khong the them CD vao danh sach");
		}
	}

	// Check if maCd is already in the list
	public boolean checkMaCd(int maCd) {
		if (this.i == 0)
			return false;

		for (int j = 0; j < this.i; j++) {
			if (CDList[j].getMaCd() == maCd) {
				return true;
			}
		}
		return false;
	}

	// Count number of CDs in the list
	public int countCD() {
		return i;
	}

	// Calculate sum of giaThanh in the list
	public double tinhTongGiaThanh() {
		double sum = 0;
		for (int i = 0; i < this.i; i++) {
			sum += CDList[i].getGiaThanh();
		}
		return sum;
	}

	// Delete CD by maCD
	public void deleteCDByMaCD() {
		int x;
		System.out.println("Nhap vao ma CD can xoa: ");
		x = sc.nextInt();
		int foundIndex = findCDByMaCD(x);

		if (this.i == 1 && foundIndex != -1) {
			System.out.println("Da xoa CD " + CDList[foundIndex].getMaCd());
			this.i = this.i - 1;
			CDList = new CD[n];
			return;
		}

		if (foundIndex != -1) {
			System.out.println("Da xoa CD " + CDList[foundIndex].getMaCd());
			for (int j = foundIndex; j < this.i - 1; j++) {
				CDList[j] = CDList[j + 1];
			}
			this.i = this.i - 1;

		} else {
			System.out.println("Khong ton tai CD de xoa!");
		}
	}

	// Find CD by maCD, return index if found, else return -1
	public int findCDByMaCD(int x) {
		int foundIndex = -1;
		for (int j = 0; j < this.i; j++) {
			if (CDList[j].getMaCd() == x) {
				foundIndex = j;
			}
		}
		return foundIndex;
	}

	// Print one CD by index
	public void printOneCD(int index) {
		System.out.println("Ma CD: " + CDList[index].getMaCd());
		System.out.println("Ten CD: " + CDList[index].getTuaCd());
		System.out.println("Gia CD: " + CDList[index].getGiaThanh());
	}

	// Print all CDs in the list
	public void printAllCD() {
		if (this.i == 0) {
			System.out.println("Danh sach rong");
		} else {
			System.out
					.println(String.format("|%-20s|%-20s|%-20s|%-20s|", "Ma CD", "Tua CD", "So bai hat", "Gia thanh"));
			System.out.println(
					"===============================================================================================");
			for (int i = 0; i < this.i; i++) {
				System.out.println(CDList[i].toString());
			}
		}
	}

	// Sort CDs in the list by giaThanh
	public void sortCDTheoGiaThanh() {
		for (int i = 0; i < this.i - 1; i++) {
			for (int j = i + 1; j < this.i; j++) {
				if (CDList[i].getGiaThanh() < CDList[j].getGiaThanh()) {
					CD temp = CDList[i];
					CDList[i] = CDList[j];
					CDList[j] = temp;
				}
			}
		}
	}

	// Sort CDs in the list by tuaCD
	public void sortCDTheoTuaCD() {
		for (int i = 0; i < this.i - 1; i++) {
			for (int j = i + 1; j < this.i; j++) {
				if (CDList[i].getTuaCd().compareToIgnoreCase(CDList[j].getTuaCd()) > 0) {
					CD temp = CDList[i];
					CDList[i] = CDList[j];
					CDList[j] = temp;
				}
			}
		}
	}
}
