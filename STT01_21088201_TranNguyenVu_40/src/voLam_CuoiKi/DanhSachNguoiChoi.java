import java.util.ArrayList;
import java.util.List;

public class DanhSachNguoiChoi {
    List<NguoiChoi> ls;

    public DanhSachNguoiChoi() {
        ls = new ArrayList<NguoiChoi>();
    }

    public void themNguoiChoi(NguoiChoi nc) {
        ls.add(nc);
    }

    public void xoaNguoiChoi(NguoiChoi nc) {
        ls.remove(nc);
    }

    public void timMaxSatThuong() {
        NguoiChoi max = ls.get(0);

        for (NguoiChoi n : ls) {
            if (n.getMucSatThuong() > max.getMucSatThuong()) {
                max = n;
            }
        }

        System.out.println("Nguoi choi co muc sat thuong cao nhat la: ");
        System.out.println(String.format("%-20s|%-20s|%-20s|\n", "Cap do", "Muc sat thuong", "Mon phai"));
        System.out.println(max);
    }

    @Override
    public String toString() {
        String s = "";

        s += String.format("%-20s|%-20s|%-20s|\n", "Cap do", "Muc sat thuong", "Mon phai");

        for (NguoiChoi n : ls) {
            s += n.toString();
            s += "\n";
        }

        return s;
    }
}
