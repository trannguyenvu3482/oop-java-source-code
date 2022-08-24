package bai06;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Tran Nguyen Vu", "Mercedes C300 AMG", 3000000, 4000);
        Vehicle xe2 = new Vehicle("Tran Van Hai", "Future Neo", 25000, 125);
        Vehicle xe3 = new Vehicle("Tran Van Long", "Toyota Vios", 650000, 3000);

        System.out.println(
                String.format("%-20s %-20s %-10s %-10s %-10s", "Chu xe", "Loai xe", "Dung tich", "Gia xe", "Thue xe"));
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
    }
}
