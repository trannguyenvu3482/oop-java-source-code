package bai14;

public class Product {
    private String description;
    private String productID;
    private double price;

    public Product() {
        this.description = "";
        this.productID = "";
        this.price = 0;
    }

    public Product(String description, String productID, double price) {
        setDescription(description);
        setProductID(productID);
        setPrice(price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() > 0) {
            this.description = description;
        }
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        if (productID.length() > 0) {
            this.productID = productID;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Product{" + "description=" + description + ", productID=" + productID + ", price=" + price + '}';
    }
}
