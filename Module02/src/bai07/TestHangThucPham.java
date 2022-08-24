package bai07;

import java.time.LocalDate;
import java.time.Month;

public class TestHangThucPham {
        public static void main(String[] args) throws Exception {
                HangThucPham htp1 = new HangThucPham("001", "Gao", 100000, LocalDate.now(), LocalDate.now());
                HangThucPham htp2 = new HangThucPham("002", "Mi", 100000, LocalDate.of(2022, Month.MAY, 18),
                                LocalDate.of(2023, Month.DECEMBER, 18));
                HangThucPham htp3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.of(2018, Month.MARCH, 1),
                                LocalDate.of(2019, Month.MARCH, 1));

                System.out.println(
                                String.format("%-10s %-20s %-10s %-10s %-10s %-10s", "Ma hang", "Ten hang", "Don gia",
                                                "Ngay san xuat", "Ngay het han", "Ghi chu"));
                System.out.println("-------------------------------------------------------");
                System.out.println(htp1);
                System.out.println(htp2);
                System.out.println(htp3);
        }
}
