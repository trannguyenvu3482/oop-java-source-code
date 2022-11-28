package cuoiKi_thuNghiem;

import java.util.Calendar;

public class Fresher extends Employee {
    private int gradYear;
    private String gradRank;

    public Fresher(String maNV, FullName fullName, Calendar ngaySinh, String phoneNumber, int gradYear,
            String gradRank) throws Exception {
        super(maNV, fullName, ngaySinh, phoneNumber);
        setGradRank(gradRank);
        setGradYear(gradYear);
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getGradRank() {
        return gradRank;
    }

    public void setGradYear(int gradYear) throws Exception {
        if (gradYear <= 2022) {
            this.gradYear = gradYear;
        } else
            throw new Exception("Nam tot nghiep phai tu 2022 tro ve truoc");
    }

    public void setGradRank(String gradRank) throws Exception {
        if (!gradRank.equalsIgnoreCase("")) {
            this.gradRank = gradRank;
        } else
            throw new Exception("Khong duoc rong");
    }

    @Override
    public String toString() {
        String s = super.toString();

        s += String.format("%-20s|%-20d|%-20s|%-20s|%-20s|", "", gradYear, gradRank, "", "");

        return s;
    }
}
