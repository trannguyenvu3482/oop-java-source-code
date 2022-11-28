package dateTime_Test;

import java.time.LocalDate;

public class TestSinhVien {
	public static void main(String[] args) throws Exception {
		SinhVien sv1 = new SinhVien("001", "Tran Nguyen Vu", LocalDate.of(2022, 10, 31), 10);

		System.out.println("Date count from today: " + sv1.ngaySinhTillNow());

		System.out.println(sv1);
	}
}
