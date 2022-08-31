package bai02;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2, 3, "A");

        System.out.println(p1);
        System.out.println("Diem doi xung: " + p1.negate());
        System.out.println("Khoang cach tu O den diem do: " + p1.getDistance());
    }
}
