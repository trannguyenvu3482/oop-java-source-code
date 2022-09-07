<<<<<<< HEAD
package bai08;

public class TestAccount {
	public static void main(String[] args) {
		// Create 3 new accounts
		Account acc1 = new Account("Tran Van A", 72354, 102.56);
		Account acc2 = new Account("Nguyen Van B", 69713, 40.00);
		Account acc3 = new Account("Tran Nguyen Vu", 93757, 759.32);

		acc1.deposit(25.85);
		acc2.deposit(500.00);
		acc2.withdraw(430.75, 1.50);

		acc3.addInterest();

		System.out.println(String.format("%-20s %-20s %-20s", "Name", "Account Number", "Balance"));
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

		System.out.println("\nDang chuyen 100.00 tu tai khoan " + acc1.getAccountNumber() + " sang tai khoan "
				+ acc2.getAccountNumber());

		if (acc1.transfer(acc2, 100.00)) {
			System.out.println("Chuyen thanh cong\n");
		} else {
			System.out.println("Chuyen that bai\n");
		}

		System.out.println(String.format("%-20s %-20s %-20s", "Name", "Account Number", "Balance"));
		System.out.println(acc1);
		System.out.println(acc2);
	}
}
=======
package bai08;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("Tran Van A", 72354, 102.56);
        Account acc2 = new Account("Nguyen Van B", 69713, 40.00);
        Account acc3 = new Account("Tran Nguyen Vu", 93757, 759.32);

        acc1.deposit(25.85);
        acc2.deposit(500.00);
        acc2.withdraw(430.75, 1.50);

        acc3.addInterest();

        System.out.println(String.format("%-20s %-20s %-20s", "Name", "Account Number", "Balance"));
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

        System.out.println("\nDang chuyen 100.00 tu tai khoan " + acc1.getAccountNumber() + " sang tai khoan "
                + acc2.getAccountNumber());

        if (acc1.transfer(acc2, 100.00)) {
            System.out.println("Chuyen thanh cong\n");
        } else {
            System.out.println("Chuyen that bai\n");
        }

        System.out.println(String.format("%-20s %-20s %-20s", "Name", "Account Number", "Balance"));
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
>>>>>>> branch 'master' of https://github.com/trannguyenvu3482/oop-java-source-code.git
