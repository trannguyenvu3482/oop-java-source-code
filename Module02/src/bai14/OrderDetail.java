package bai14;

public class OrderDetail {
	private int quantity;
	private Product product;

	public OrderDetail() {
		this.quantity = 0;
		this.product = new Product();
	}

	public OrderDetail(int quantity, Product product) {
		if (quantity > 0) {
			this.quantity = quantity;
		}

		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double calcTotalPrice() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		return "OrderDetail{" + "quantity=" + quantity + ", product=" + product + '}';
	}
}
