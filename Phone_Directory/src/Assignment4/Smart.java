/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;
import java.util.Date;

public class Smart extends Phone {

	private double cpuSpeed;

	public Smart(double cpuSpeed, String id, String brand, double price, Date dateAvailable) {
		super(id, brand, price, dateAvailable);
		this.cpuSpeed = cpuSpeed;
	}

	public double getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public String getName() {
		return "Smart";
	}
}
