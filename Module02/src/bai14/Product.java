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

	public Product(String description, String productID, double price) throws Exception {
		this.description = "";
		this.productID = "";
		this.price = 0;

		if (description.length() > 0) {
			this.description = description;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}

		if (productID.length() > 0) {
			this.productID = productID;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}

		if (price > 0) {
			this.price = price;
		} else {
			throw new Exception("Gia phai lon hon 0");
		}

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) throws Exception {
		if (description.length() > 0) {
			this.description = description;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) throws Exception {
		if (productID.length() > 0) {
			this.productID = productID;
		} else {
			throw new Exception("Chuoi khong duoc rong");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if (price > 0) {
			this.price = price;
		} else {
			throw new Exception("Gia phai lon hon 0");
		}
	}

	@Override
	public String toString() {
		return "Product{" + "description=" + description + ", productID=" + productID + ", price=" + price + '}';
	}
}
