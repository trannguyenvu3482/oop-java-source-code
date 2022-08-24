package bai06;

public class Vehicle {
    // Attributes
    private String chuXe;
    private String loaiXe;
    private double giaXe;
    private int dungTich;

    // Constructor
    public Vehicle() {
        this.chuXe = "";
        this.loaiXe = "";
        this.giaXe = 0;
        this.dungTich = 0;
    }

    public Vehicle(String chuXe, String loaiXe, double giaXe, int dungTich) {
        setChuXe(chuXe);
        setLoaiXe(loaiXe);
        setGiaXe(giaXe);
        setDungTich(dungTich);
    }

    // Getters and setters
    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        if (chuXe.length() > 0) {
            this.chuXe = chuXe;
        }
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        if (loaiXe.length() > 0) {
            this.loaiXe = loaiXe;
        }
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        if (giaXe > 0) {
            this.giaXe = giaXe;
        }
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        if (dungTich > 0) {
            this.dungTich = dungTich;
        }
    }

    // Methods
    public double getThueXe() {
        if (dungTich < 100) {
            return 0.01 * giaXe;
        } else if (dungTich < 200) {
            return 0.03 * giaXe;
        } else {
            return 0.05 * giaXe;
        }
    }

    // toString() method
    @Override
    public String toString() {
        return String.format("%-20s %-20s %-10d %-10.2f %-10.2f ", chuXe, loaiXe, dungTich, giaXe, getThueXe());
    }
}
