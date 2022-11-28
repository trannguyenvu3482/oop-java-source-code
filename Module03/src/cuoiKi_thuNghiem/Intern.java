package cuoiKi_thuNghiem;

import java.util.Calendar;

public class Intern extends Employee {
    private String major;
    private int semester;

    public Intern(String maNV, FullName fullName, Calendar ngaySinh, String phoneNumber, String major, int semester)
            throws Exception {
        super(maNV, fullName, ngaySinh, phoneNumber);
        setMajor(major);
        setSemester(semester);
    }

    public String getMajor() {
        return major;
    }

    public int getSemester() {
        return semester;
    }

    public void setMajor(String major) throws Exception {
        if (!major.equalsIgnoreCase("")) {
            this.major = major;
        } else
            throw new Exception("Khong duoc rong");
    }

    public void setSemester(int semester) throws Exception {
        if (semester > 0) {
            this.semester = semester;
        } else
            throw new Exception("Phai lon hon 0");
    }

    @Override
    public String toString() {
        String s = super.toString();

        s += String.format("%-20s|%-20s|%-20s|%-20s|%-20d|", "", "", "", major, semester);

        return s;
    }
}
