import java.util.Date;

/*
 * An abstract class. All methods have implementations in this class except for 𝑔𝑒𝑡𝑁𝑎𝑚𝑒. This is the only abstract
method. When implementing this method in the derived classes, each class returns its name (i.e.
𝑆𝑚𝑎𝑟𝑡, 𝑊𝑖𝑟𝑒𝑙𝑒𝑠𝑠, 𝐼𝑃𝑃h𝑜𝑛𝑒).
* The class implements the 𝐶𝑜𝑚𝑝𝑎𝑟𝑎𝑏𝑙𝑒 interface. This is necessary for accurate object comparison. When a class
implements this Interface, it is required to implement the 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜􏰁 􏰂 method. Your implementation should
compare the 𝑖𝑑 member of both objects. Simply put, two objects of type 𝑃h𝑜𝑛𝑒 are equal if their 𝐼𝐷s are equal.
*/
public abstract class Phone implements Comparable<Phone>{
	protected String id;
	protected String brand;
	protected double price;
	protected Date dateAvailable;
	
	abstract String getName();
	
	public double getPrice() {
		return price;
	}
	
	public Phone (String id, String brand, double price, Date dateAvailable) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.dateAvailable = dateAvailable;
	}
	
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
