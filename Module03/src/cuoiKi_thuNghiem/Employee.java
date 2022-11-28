package cuoiKi_thuNghiem;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public abstract class Employee {
    protected String maNV;
    protected FullName fullName;
    protected Calendar ngaySinh;
    protected String phoneNumber;

    public Employee(String maNV, FullName fullName, Calendar ngaySinh, String phoneNumber) throws Exception {
        setMaNV(maNV);
        setFullName(fullName);
        setNgaySinh(ngaySinh);
        setPhoneNumber(phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maNV);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(maNV, other.maNV);
    }

    public String getMaNV() {
        return maNV;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Calendar getNgaySinh() {
        return ngaySinh;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setMaNV(String maNV) throws Exception {
        if (!maNV.equalsIgnoreCase("")) {
            this.maNV = maNV;
        } else
            throw new Exception("Khong duoc rong");
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setNgaySinh(Calendar ngaySinh) throws Exception {

        if (Calendar.getInstance().get(Calendar.YEAR) - ngaySinh.get(Calendar.YEAR) >= 20) {
            this.ngaySinh = ngaySinh;
        } else
            throw new Exception("Phai lon hon hoac bang 20 tuoi");
    }

    public void setPhoneNumber(String phoneNumber) throws Exception {
        if (phoneNumber.length() == 10 && phoneNumber.startsWith("0")) {
            this.phoneNumber = phoneNumber;
        } else
            throw new Exception("Phai co 10 ki tu va bat dau bang so 0");
    }

    Locale lc = new Locale("vi", "VN");
    DateFormat df = DateFormat.getDateInstance(2, lc);

    @Override
    public String toString() {
        String s = "";

        s += String.format("%-20s|%-20s|%-20s|%-20s|", maNV, fullName, df.format(ngaySinh.getTime()), phoneNumber);

        return s;
    }
}
