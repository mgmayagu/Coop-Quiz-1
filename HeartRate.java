/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Target_Heart_Rate_calculator;
import java.util.GregorianCalendar;

/**
 *
 * @author michaelmayaguari
 */
public class HeartRate {
    /*The class attributes should include the person’s first name, last name and
	date of birth (consisting of separate attributes for the month, day and year of birth). 
	Your class should have a constructor that receives this data as parameters. For each 
	attribute provide set and get methods. The class also should include a method that 
	calculates and returns the person’s age (in years), a method that calculates and returns 
	the person’s maximum heart rate and a method that calculates and returns the person’s
	target heart rate.
    */
	
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public int calculateAge() {
		int currentYear = new GregorianCalendar(). get(GregorianCalendar. YEAR);
		int age = currentYear - yearOfBirth;
		return age;
	}
	
	public int maxHeartRate() {
		int maxHeartRate = 220 - calculateAge(); 
		return maxHeartRate;
	}
	
	public long lowerTargetHeartRate() {
		return Math.round(maxHeartRate() * 0.50);
		
	}
	public long higherTargetHeartRate() {
		return Math.round(maxHeartRate() * .85);
	}
    
}
