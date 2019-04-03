/*
 * Example source code:
 * https://github.com/thjanssen/Stackify-SOLID-Liskov
 */
package ro.ubb.dp1819.examples.solid.liskov.coffeemachine;

public class Configuration {

	private double quantityCoffee;
	private double quantityWater;

	public Configuration(double quantityCoffee, double quantityWater) {
		this.quantityCoffee = quantityCoffee;
		this.quantityWater = quantityWater;
	}

	public double getQuantityCoffee() {
		return quantityCoffee;
	}

	public double getQuantityWater() {
		return quantityWater;
	}

}
