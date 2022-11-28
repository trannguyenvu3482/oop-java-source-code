package cuoiKi_thuNghiem;

import java.util.Calendar;

public class Experience extends Employee {
    private int expInYear;

    public Experience(String maNV, FullName fullName, Calendar ngaySinh, String phoneNumber, int expInYear)
            throws Exception {
        super(maNV, fullName, ngaySinh, phoneNumber);
        setExpInYear(expInYear);
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) throws Exception {
        if (expInYear > 0) {
            this.expInYear = expInYear;
        } else
            throw new Exception("So phai lon hon 0");
    }

    @Override
    public String toString() {
        String s = super.toString();

        s += String.format("%-20d|%-20s|%-20s|%-20s|%-20s|", expInYear, "", "", "", "");

        return s;
    }
}
