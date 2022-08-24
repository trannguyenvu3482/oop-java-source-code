package bai14;

import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail[] lineItems;
    private int count;
    final static int MAX_LINE_ITEMS = 100;

    Locale local = new Locale("vi", "VN");
    NumberFormat nf = NumberFormat.getCurrencyInstance(local);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Order() {
        setOrderID(1);
        setOrderDate(LocalDate.now());
        this.lineItems = new OrderDetail[100];
        this.count = 0;
    }

    public Order(int orderID, LocalDate orderDate) {
        setOrderID(orderID);
        setOrderDate(orderDate);
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        if (orderID > 0) {
            this.orderID = orderID;
        }
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderDetail[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(OrderDetail[] lineItems) {
        this.lineItems = lineItems;
    }

    public void addLineitem(Product p, int q) {
        OrderDetail od = new OrderDetail(q, p);
        if (count < MAX_LINE_ITEMS) {
            lineItems[count] = od;
            count++;
        }
    }

    public double calcTotalCharge() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += lineItems[i].calcTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        System.out.println("Ma HD: " + orderID);
        System.out.println("Ngay lap hoa don: " + dtf.format(orderDate));
        System.out
                .println(String.format("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s", "STT", "Ma SP", "Mo ta", "Don gia",
                        "So luong",
                        "Thanh tien"));

        for (int i = 0; i < count; i++) {
            System.out.println(
                    String.format("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s", i + 1,
                            lineItems[i].getProduct().getProductID(),
                            lineItems[i].getProduct().getDescription(), nf.format(lineItems[i].getProduct().getPrice()),
                            lineItems[i].getQuantity(), nf.format(lineItems[i].calcTotalPrice())));
        }

        return "Tong tien thanh toan: " + nf.format(calcTotalCharge());
    }
}
