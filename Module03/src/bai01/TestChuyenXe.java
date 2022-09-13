package bai01;

import java.text.NumberFormat;
import java.util.Locale;

public class TestChuyenXe {
	public static void main(String[] args) {
		// Create formatter to format money
		Locale locale = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

		// Create 2 bus in each group
		ChuyenXeNoiThanh xeNoiThanh01 = new ChuyenXeNoiThanh(1, "Nguyen Van A", 3, 400000, 3, 7);
		ChuyenXeNoiThanh xeNoiThanh02 = new ChuyenXeNoiThanh(2, "Nguyen Van B", 4, 500000, 4, 8);
		ChuyenXeNgoaiThanh xeNgoaiThanh01 = new ChuyenXeNgoaiThanh(3, "Nguyen Van C", 2, 150000, "Ho Chi Minh", 5);
		ChuyenXeNgoaiThanh xeNgoaiThanh02 = new ChuyenXeNgoaiThanh(4, "Nguyen Van D", 0, 300000, "Ha Noi", 6);

		// Calculate doanhThu
		int tongDTXeNoiThanh = xeNoiThanh01.getDoanhThu() + xeNoiThanh02.getDoanhThu();
		int tongDTXeNgoaiThanh = xeNgoaiThanh01.getDoanhThu() + xeNgoaiThanh02.getDoanhThu();

		// Print out the results
		System.out.println("Tong doanh thu cua xe noi thanh: " + nf.format(tongDTXeNgoaiThanh));
		System.out.println("Tong doanh thu cua xe ngoai thanh: " + nf.format(tongDTXeNoiThanh));
		System.out.println("-------------------------------------------------");
		System.out.println("Tong doanh thu cua tat ca chuyen xe: " + nf.format(tongDTXeNgoaiThanh + tongDTXeNoiThanh));
	}
}
