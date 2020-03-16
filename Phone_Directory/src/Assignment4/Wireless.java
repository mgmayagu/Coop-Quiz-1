/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

/**
 *
 * @author michaelmayaguari
 */
import java.util.Date;

public class Wireless extends Landline{
	
	protected double range;
	
	public Wireless(double range, String id, String brand, double price, Date dateAvailable) {
		super(id, brand, price, dateAvailable);
		this.range = range;
	}
	
	public double getRange() {
		return range;
	}

	public String getName() {
		return "Wireless";
	}
}
