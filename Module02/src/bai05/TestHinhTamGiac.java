package bai05;

public class TestHinhTamGiac {
    public static void main(String[] args) {
        HinhTamGiac tg1 = new HinhTamGiac(-1, 0, 2);
        HinhTamGiac tg2 = new HinhTamGiac(1, 2, 10);
        HinhTamGiac tg3 = new HinhTamGiac(6, 8, 10);
        HinhTamGiac tg4 = new HinhTamGiac(4, 4, 6);
        HinhTamGiac tg5 = new HinhTamGiac(4, 4, 4);

        System.out.println(String.format("%10s %10s %10s %20s %10s %10s", "Canh ma", "Canh mb", "Canh mc",
                "Loai tam giac", "Chu vi", "Dien tich"));
        System.out.println(tg1);
        System.out.println(tg2);
        System.out.println(tg3);
        System.out.println(tg4);
        System.out.println(tg5);
    }
}
