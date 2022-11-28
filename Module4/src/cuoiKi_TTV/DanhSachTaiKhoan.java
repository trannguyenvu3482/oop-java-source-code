package cuoiKi_TTV;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DanhSachTaiKhoan {
	private List<TaiKhoanThe> ls;

	public DanhSachTaiKhoan() {
		ls = new ArrayList<TaiKhoanThe>();
	}

	public boolean themTaiKhoan(TaiKhoanThe t) {
		if (ls.contains(t)) {
			return false;
		} else {
			return ls.add(t);
		}
	}

	public int demTKKhongChiTieu() {
		int count = 0;
		for (TaiKhoanThe t : ls) {
			if (!t.checkChiTieu()) {
				count++;
			}
		}

		return count;
	}

	public void test() {
		Calendar c1 = new GregorianCalendar(2022, 10, 20);
		Calendar c2 = new GregorianCalendar(2022, 10, 30);

		long getDiff = (c2.getTimeInMillis() - c1.getTimeInMillis());

		long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);

		System.out.println("So ngay giua 2 ngay: " + getDaysDiff);
	}

	public void testCalendar() {
		Calendar o1 = new GregorianCalendar(2022, 10, 31);

		Locale lc = new Locale("vi", "VN");
		DateFormat df = DateFormat.getDateInstance(1, lc);
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);

		df.format(o1.getTime());
		nf.format(20000);
	}

	public boolean suaHanMuc(String maThe, double hanMuc) throws Exception {
		for (TaiKhoanThe t : ls) {
			if (t.getMaThe().equals(maThe) && t instanceof TheTinDung) {
				((TheTinDung) t).setHanMuc(hanMuc);
				return true;
			}
		}

		return false;
	}

	public void sapXepTheoMa() {
		Collections.sort(ls, new Comparator<TaiKhoanThe>() {
			@Override
			public int compare(TaiKhoanThe o1, TaiKhoanThe o2) {
				if (o1.getMaThe().compareTo(o2.getMaThe()) > 0) {
					return -1;
				} else if (o1.getMaThe().compareTo(o2.getMaThe()) < 0) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}

	public void maxHanMuc() {
		Calendar c = new GregorianCalendar(2022, 10, 31);
		List<TheTinDung> lsMax = new ArrayList<TheTinDung>();

		for (TaiKhoanThe t : ls) {
			if (t instanceof TheTinDung && c.compareTo(new GregorianCalendar(2022, 10, 31)) == 0) {
				lsMax.add((TheTinDung) t);
			}
		}

		if (lsMax.isEmpty())
			return;

		TheTinDung theMax = lsMax.get(0);
		for (TheTinDung t : lsMax) {
			if (t.getHanMuc() > theMax.getHanMuc()) {
				theMax = t;
			}
		}

		System.out.println("Danh sach cac the co kha nang chi tieu");
		String s = "";
		s += String.format("%-20s|%-20s|%-20s|%-20s|%-20s\n", "Ma the", "Chu the", "So du", "Han muc",
				"Chi tieu trong thang");
		for (TaiKhoanThe t : lsMax) {
			s += t.toString();
			s += "\n";
		}

		System.out.println(s);

		System.out.println("The tin dung co han muc cao nhat: ");
		System.out.println(theMax);
	}

	@Override
	public String toString() {
		String s = "";
		s += String.format("%-20s|%-20s|%-20s|%-20s|%-20s\n", "Ma the", "Chu the", "So du", "Han muc",
				"Chi tieu trong thang");
		for (TaiKhoanThe t : ls) {
			s += t.toString();
			s += "\n";
		}

		return s;
	}
}
