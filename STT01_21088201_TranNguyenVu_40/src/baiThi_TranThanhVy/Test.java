package baiThi_TranThanhVy;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {
	public static void main(String[] args) throws Exception {
		ThueBao tb1 = new ThueBao("0913. 33 44 55", "Tran Van An");
		ThueBao tb2 = new ThueBao("0918. 55 66 77", "Nguyen Thi Anh");

		CuocPhi cp1 = new CuocPhi(tb1, 1, 2018, 200);
		CuocPhi cp2 = new CuocPhi(tb1, 2, 2018, 100);
		CuocPhi cp3 = new CuocPhi(tb2, 1, 2018, 250);
		CuocPhi cp4 = new CuocPhi(tb2, 2, 2018, 140);
		CuocPhi cp5 = new CuocPhi(tb2, 3, 2018, 240);
		CuocPhi[] dsCuocPhi = { cp1, cp2, cp3, cp4, cp5 };

		System.out.println(
				String.format("%-30s|%-20s|%-20s|%-20s", "Ho ten", "Thang/nam", "So MB su dung", "Thanh tien"));
		for (CuocPhi cp : dsCuocPhi) {
			System.out.println(cp);
		}

		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		int sumCuocPhi = 0;
		for (CuocPhi cp : dsCuocPhi) {
			sumCuocPhi += cp.tinhTien();
		}

		System.out.println("Tong toan bo cac cuoc phi la: " + nf.format(sumCuocPhi));
	}
}
