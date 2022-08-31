package bai05;

public class HinhTamGiac {
    // Attributes
    private double ma;
    private double mb;
    private double mc;

    // Constructor
    public HinhTamGiac() {
        this.ma = 0;
        this.mb = 0;
        this.mc = 0;
    }

    public HinhTamGiac(double ma, double mb, double mc) {
        this.ma = ma;
        this.mb = mb;
        this.mc = mc;

        if (checkTamGiac() == "Khong phai tam giac") {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
    }

    // Getters and setters
    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        if (ma > 0) {
            this.ma = ma;
        }
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        if (mb > 0) {
            this.mb = mb;
        }
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) {
        if (mc > 0) {
            this.mc = mc;
        }
    }

    // Methods
    public double getChuVi() {
        return this.ma + this.mb + this.mc;
    }

    public double getDienTich() {
        double p = this.getChuVi() / 2;
        return Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc));
    }

    public String checkTamGiac() {
        if (this.ma + this.mb > this.mc && this.ma + this.mc > this.mb && this.mb + this.mc > this.ma) {
            if (this.ma == this.mb && this.ma == this.mc) {
                return "Tam giac deu";
            }
            if (this.ma == this.mb || this.ma == this.mc || this.mb == this.mc) {
                return "Tam giac can";
            }
            return "Tam giac thuong";
        } else {
            // Khong phai tam giac
            return "Khong phai tam giac";
        }
    }

    @Override
    public String toString() {
        return String.format("%10.2f %10.2f %10.2f %20s %10.2f %10.2f", ma, mb, mc, checkTamGiac(), getChuVi(),
                getDienTich());
    }
}
