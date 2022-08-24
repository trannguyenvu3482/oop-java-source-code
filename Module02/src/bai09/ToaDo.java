package bai09;

public class ToaDo {
    private String ten;
    private float x;
    private float y;

    // Constructor
    public ToaDo() {
        this.ten = "O";
    }

    public ToaDo(float x, float y) {
        this.ten = "O";
        setX(x);
        setY(y);
    }

    // Getter and Setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // toString
    @Override
    public String toString() {
        return ten + "(" + x + "," + y + ")";
    }
}
