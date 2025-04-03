package Classes;

public class exer2classe {
	
	//ATRIBUTOS
	private String name;
	private double price;
	private int quantity;
    
	//CONSTRUTOR
	public exer2classe(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//SOBRECARGA
	public exer2classe(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//ENCAPSULAMENTO - NAME
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ENCAPSULAMENTO - PRICE
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//ENCAPSULAMENTO - QUANTIDADE
	public int getQuantity() {
		return quantity;
	}

	//METADOS
	public double totalValueinStock() {
		return quantity * price;
	}

	public void addProducts(int quantity){
		this.quantity += quantity;
	}

	public void removeProducts(int quantity){
		this.quantity -= quantity;
	}

	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f", totalValueinStock());
	}

}


