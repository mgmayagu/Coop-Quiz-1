/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Date;
/**
 * An abstract class that implements the Comparable interface
 * 
 * @author MichaelMayaguari
 *
 */
public abstract class Phone implements Comparable<Phone> {
	protected String id;
	protected String brand;
	protected double price;
	protected Date dateAvailable;

	abstract String getName();

	public double getPrice() {
		return price;
	}
	
	public Phone(String id, String brand, double price, Date dateAvailable) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.dateAvailable = dateAvailable;
	}
	/**
	 * Compares the ID member of both objects.
	 */
	public int compareTo(Phone phone) {
		return id.compareTo(phone.getId());
	}

	public String getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public Date getDateAvailable() {
		return dateAvailable;
	}
}
