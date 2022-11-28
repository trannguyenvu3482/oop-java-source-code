package cuoiKi_thuNghiem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachNhanVien {
    List<Employee> ls;

    public DanhSachNhanVien() {
        ls = new ArrayList<Employee>();
    }

    public boolean themNhanVien(Employee e) {
        if (ls.contains(e)) {
            return false;
        } else {
            return ls.add(e);
        }
    }

    public int demNhanVienTotNghiep() {
        int count = 0;
        for (Employee e : ls) {
            if (e instanceof Fresher && ((Fresher) e).getGradYear() == 2022) {
                count++;
            }
        }

        return count;
    }

    public boolean suaNgaySinh(String maNV, Calendar ngaySinh) {
        for (Employee e : ls) {
            if (e.getMaNV().equals(maNV)) {
                try {
                    e.setNgaySinh(ngaySinh);
                    return true;
                } catch (Exception e1) {
                    return false;
                }
            }
        }

        return false;
    }

    public List<Employee> getNhanVien5Yrs() {
        List<Employee> lsResult = new ArrayList<Employee>();

        for (Employee e : ls) {
            if (e instanceof Experience && ((Experience) e).getExpInYear() > 5) {
                lsResult.add(e);
            }
        }

        return lsResult;
    }

    public void sortByTen() {
        Collections.sort(ls, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFullName().getFirstName().compareToIgnoreCase(o2.getFullName().getFirstName());
            }
        });
    }

    @Override
    public String toString() {
        String s = "";

        s += String.format("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s\n", "Ma nhan vien", "Ho va ten",
                "Ngay sinh", "So dien thoai", "So nam kinh nghiem", "Nam tot nghiep", "Loai tot nghiep", "Chuyen nganh",
                "Ki dang hoc");

        for (Employee e : ls) {
            s += e.toString();
            s += "\n";
        }

        return s;
    }
}
