/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;


import java.util.Date;

public class IPPhone extends Landline{
	
	protected String protocol;
	
	public IPPhone(String protocol, String id, String brand, double price, Date dateAvailable) {
		super(id, brand, price, dateAvailable);
		this.protocol = protocol;
	}
	
	public String getProtocol() {
		return protocol;
	}
	
	public String getName() {
		return "IPPhone";	
	}
}
