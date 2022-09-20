package maybay;

import java.time.LocalDate;

public class TestVeMayBay {
	public static void main(String[] args) throws Exception {
		VeMayBay vmb1 = new VeMayBay("001", "HCM", "HN", LocalDate.of(2022, 10, 12), 500000);
		VeMayBay vmb2 = new VeMayBay("002", "HCM", "HN", LocalDate.of(2022, 10, 12), 600000);
		VeMayBay vmb3 = new VeMayBay("003", "HCM", "HN", LocalDate.of(2022, 10, 12), -10000);

		System.out.printf("%-20s|%-20s|%-20s|%-10s|\n", "Ma chuyen bay", "Ten chuyen", "Ngay bay", "Gia tien");
		System.out.println(vmb1);
		System.out.println(vmb2);
		System.out.println(vmb3);
	}
}
