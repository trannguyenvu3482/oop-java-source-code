package bai01;

public class ToaDo {
	/// Attributes
	private int toaDoX;
	private int toaDoY;
	private String tenToaDo;

	// Default Constructor
	public ToaDo() {

	}

	// Parameters Constructor
	public ToaDo(int toaDoX, int toaDoY, String tenToaDo) {
		this.toaDoX = toaDoX;
		this.toaDoY = toaDoY;
		this.tenToaDo = tenToaDo;
	}

	public int getToaDoX() {
		return toaDoX;
	}

	public int getToaDoY() {
		return toaDoY;
	}

	public String getTenToaDo() {
		return tenToaDo;
	}

	public void setToaDoX(int toaDoX) {
		this.toaDoX = toaDoX;
	}

	public void setToaDoY(int toaDoY) {
		this.toaDoY = toaDoY;
	}

	public void setTenToaDo(String tenToaDo) {
		this.tenToaDo = tenToaDo;
	}

	@Override
	public String toString() {
		return tenToaDo + "(" + toaDoX + "," + toaDoY + ")";
	}
}
