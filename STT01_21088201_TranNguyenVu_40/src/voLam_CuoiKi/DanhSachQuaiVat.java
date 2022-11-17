import java.util.ArrayList;
import java.util.List;

public class DanhSachQuaiVat {
    List<QuaiVat> ls;

    public DanhSachQuaiVat() {
        ls = new ArrayList<QuaiVat>();
    }

    public void themQuaiVat(QuaiVat qv) {
        ls.add(qv);
    }

    public void xoaQuaiVat(QuaiVat qv) {
        ls.remove(qv);
    }

    public void timMaxSatThuong() {
        QuaiVat max = ls.get(0);
        
        for (QuaiVat q : ls) {
            if (q.getMucSatThuong() > max.getMucSatThuong()) {
                max = q;
            }
        }

        System.out.println("Quai vat co muc sat thuong cao nhat la: ");
        System.out.println(String.format("%-20s|%-20s|%-20s|%-20s|", "Cap do", "Muc sat thuong", "Hanh quai vat", "Loai quai vat"));
        System.out.println(max);
    }

    @Override
    public String toString() {
        String s = "";

        s += String.format("%-20s|%-20s|%-20s|%-20s|\n", "Cap do", "Muc sat thuong", "Hanh quai vat", "Loai quai vat");


        for (QuaiVat n : ls) {
            s += n.toString();
            s += "\n";
        }

        return s;
    }
}
