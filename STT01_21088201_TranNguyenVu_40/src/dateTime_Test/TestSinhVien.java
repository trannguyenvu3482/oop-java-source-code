package dateTime_Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestSinhVien {
	public static void main(String[] args) throws Exception {
		String s = "23/11/2003";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyyy");
		Date d = sdf.parse(s);
		Calendar c = Calendar.getInstance();
		c.setTime(d);

		LocalDate l = LocalDate.parse(s, dtf);

		SinhVien sv1 = new SinhVien("001", "Tran Nguyen Vu", new GregorianCalendar(2022, 9, 10), 10);

		System.out.println(sv1);
	}
}
