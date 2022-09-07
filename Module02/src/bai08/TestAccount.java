package bai08;

import java.text.DecimalFormat;

public class TestAccount {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.##");
		// Create 3 new accounts
		Account acc1 = new Account("Ted Murphy", 72354, 100000);
		Account acc2 = new Account("Jane Smith", 69713, 40000);
		Account acc3 = new Account("Edward Demsey", 93757, 700000);

		acc1.deposit(250000);
		acc2.deposit(500000);
		acc2.withdraw(430000, 2000);

		acc3.addInterest();

		System.out.println("Lai suat hien tai: " + df.format(acc1.RATE * 100) + "%");
		System.out.println("Danh sach khach hang:");
		System.out.println("----------------------------------------------------------------");
		System.out.println(String.format("|%-20s|%-20s|%-20s|", "Ten khach hang", "So tai khoan", "So du"));
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

		System.out.println("\nDang chuyen 100.000 tu tai khoan " + acc1.getAccountNumber() + " sang tai khoan "
				+ acc2.getAccountNumber());

		if (acc1.transfer(acc2, 100000)) {
			System.out.println("Chuyen thanh cong\n");
		} else {
			System.out.println("Chuyen that bai\n");
		}

		System.out.println("----------------------------------------------------------------");
		System.out.println(String.format("|%-20s|%-20s|%-20s|", "Name", "Account Number", "Balance"));
		System.out.println(acc1);
		System.out.println(acc2);
	}
}
