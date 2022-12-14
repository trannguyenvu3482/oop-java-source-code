package deThi_benhNhan;

public class DanhSachBenhNhan {
	private BenhNhan[] danhSachBenhNhan;
	private int count;

	public DanhSachBenhNhan(int n) {
		danhSachBenhNhan = new BenhNhan[n];
		count = 0;
	}

	public void sapXepDSBNNgaySinh() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (danhSachBenhNhan[i].getNgaySinh().isBefore(danhSachBenhNhan[j].getNgaySinh())) {
					BenhNhan temp = danhSachBenhNhan[i];
					danhSachBenhNhan[i] = danhSachBenhNhan[j];
					danhSachBenhNhan[j] = temp;
				}
			}
		}
	}

	public boolean themMoiBenhNhan(BenhNhan bn) {
		if (count == danhSachBenhNhan.length) {
			// Tạo mảng tam có kích thước tăng 75% so với mảng cũ
			BenhNhan[] tam = new BenhNhan[(int) (count * 1.75)];

			// Copy dữ liệu từ mảng cũ sang mảng tạm
			System.arraycopy(danhSachBenhNhan, 0, tam, 0, (int) (count * 1.75));

			// Gán mảng DSBN thành mảng tam
			danhSachBenhNhan = tam;
		}

		// Kiem tra trung ma
		for (int i = 0; i < count; i++) {
			if (danhSachBenhNhan[i].getMaSoBN().equals(bn.getMaSoBN())) {
				return false;
			}
		}

		danhSachBenhNhan[count] = bn;
		count++;
		return true;
	}

	public BenhNhan[] timKiemBenhNhan(String maSoBN) {
		BenhNhan[] res = new BenhNhan[count];
		int count = 0;
		for (int i = 0; i < count; i++) {
			if (danhSachBenhNhan[i].getMaSoBN().equalsIgnoreCase(maSoBN)) {
				res[count] = danhSachBenhNhan[i];
				count++;
			}
		}

		if (count == 0) {
			return null;
		} else {
			return res;
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += danhSachBenhNhan[i].toString();
			s += "\n";
		}

		return s;
	}
}
