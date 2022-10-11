package tranNguyenVu_21082801;

public class DanhSachSV {
	private int count;
	private SinhVien[] ls;

	public DanhSachSV(int n) {
		ls = new SinhVien[n];
		count = 0;
	}

	public void tangKT() {
		// Neu mang full
		if (count == ls.length) {
			SinhVien[] tam = new SinhVien[ls.length * 2];
			System.arraycopy(ls, 0, tam, 0, count);
		}
	}

	public boolean themSV(SinhVien s) {
		if (count == ls.length) {
			tangKT();
		}

		// Khoi tao
		if (count == 0) {
			ls[count] = s;
			count++;
			return true;
		}

		// Kiem tra trung
		for (SinhVien sv : ls) {
			if (sv.getMaSV().equals(s.getMaSV())) {
				return false;
			}
		}

		// Them vao
		ls[count] = s;
		count++;
		return true;
	}

	public void inKetQua() {
		for (SinhVien s : ls) {
			if (s != null) {
				System.out.println(s);
			}
		}
	}

	public SinhVien[] findSV(String maSV) {
		SinhVien[] res = new SinhVien[10];
		int resCount = 0;
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaSV().equals(maSV)) {
				res[resCount] = ls[i];
			}
		}

		if (resCount == 0) {
			return null;
		} else {
			return res;
		}
	}

	public boolean xoaSV(String maSV) {
		int find = findSV(maSV);

		if (find == -1) {
			return false;
		} else {
			for (int i = find; i < count; i++) {
				ls[i] = ls[i + 1];
			}
			count--;
			return true;
		}
	}

	public void sortSVTheoTen() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (ls[i].getHoTen().compareToIgnoreCase(ls[j].getHoTen()) > 0) {
					SinhVien temp = ls[i];
					ls[i] = ls[j];
					ls[j] = temp;
				}
			}
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
