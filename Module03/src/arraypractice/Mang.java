package arraypractice;

import java.util.Scanner;

public class Mang {
	private int n;
	private int[] a;
	Scanner sc = new Scanner(System.in);

	public Mang() {
		System.out.printf("Nhap vao n: ");
		this.n = sc.nextInt();
		a = new int[n];
	}

	public void nhapMang() {
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
	}

	public void xuatMang() {
		System.out.println("\nMang da nhap:");
		System.out.printf("n = %d\n", n);
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = %d\t", i, a[i]);
		}
	}

	public void sortTangDan() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void delete() {
		int index;
		System.out.printf("\nBan muon xoa mang tai phan tu thu may: ");

		do {
			index = sc.nextInt();
		} while (index < 0 || index > n);

		for (int i = index; i < n - 1; i++) {
			a[i] = a[i + 1];
		}

		n--;
	}

	public static void main(String[] args) {
		Mang m = new Mang();

		m.nhapMang();
		m.xuatMang();

		m.sortTangDan();
		m.xuatMang();

		m.delete();
		m.xuatMang();
	}
}