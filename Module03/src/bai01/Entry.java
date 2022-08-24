package bai01;

import java.util.*;

public class Entry {
	public static void tieuDe() {
		for (int i = 0; i < 45; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("|%-10s|%-20s|%-10s|\n", "Ma mon hoc", "Ten mon hoc", "Ngay mo lop");
		for (int i = 0; i < 45; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MonHoc m1 = new MonHoc();

		m1.setMaMH("CTDL123");
		m1.setTenMonHoc("CAU TRUC DU LIEU");
		m1.setNgayMoLop(new Date());

		tieuDe();
		System.out.println(m1);

	}
}