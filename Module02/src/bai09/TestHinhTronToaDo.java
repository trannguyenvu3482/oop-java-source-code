package bai09;

public class TestHinhTronToaDo {
    public static void main(String[] args) {
        ToaDo tam = new ToaDo(5, 5);
        HinhTron ht = new HinhTron(tam, 10.5);

        System.out.println(ht);
    }
}
