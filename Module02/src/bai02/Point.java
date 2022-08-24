package bai02;

public class Point {
    private int x;
    private int y;
    private int z;
    private String name;

    public Point() {

    }

    public Point(int x, int y, int z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public Point negate() {
        return new Point(-this.x, -this.y, -this.z, this.name);
    }

    public double getDistance() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "(" + x + "," + y + ")";
    }
}
