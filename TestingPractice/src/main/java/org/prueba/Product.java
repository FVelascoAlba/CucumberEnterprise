package org.prueba;

/**
 *
 * @author nou model
 *
 */
public class Product {
	/**
	 *
	 */
	protected double price;

	/**
	 *
	 * @param priceP of the product
	 */
	public Product(final double priceP) {
		this.price = priceP;
	}

	/**
	 *
	 * @return price
	 */
	public final double getPrice() {
		return price;
	}

	/**
	 *
	 * @param priceP price of the product
	 */
	public final void setPrice(final double priceP) {
		this.price = priceP;
	}
}
