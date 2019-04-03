/*
 * Example source code:
 * https://github.com/thjanssen/Stackify-SOLID-Liskov
 */
package ro.ubb.dp1819.examples.solid.liskov.coffeemachine;

public class Coffee {

	private String name;

	private double quantity;

	public Coffee(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
}
