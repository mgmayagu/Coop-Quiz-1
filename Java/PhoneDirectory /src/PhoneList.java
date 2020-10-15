import java.util.TreeSet;
import java.text.SimpleDateFormat;

public class PhoneList{

	private TreeSet<Phone> setPhone = new TreeSet<>();

	public PhoneList() {
	}

	public boolean add(Phone phone) {
		if (setPhone.contains(phone)) 
			return false;
		else 
			setPhone.add(phone);
		return true;
	}

	public TreeSet<Landline> getListLandline() {
		TreeSet<Landline> LLPhone = new TreeSet<>();
		for(Phone temp : setPhone) {
			if(temp instanceof Landline)
				LLPhone.add((Landline) temp);
		}
		return LLPhone;
	}
	
	private void printFrame() {
		System.out.println("+----------+-------+----------------------+-----------+------------------+--------+");
	}
	public void printFormatted() {
		String pattern = "MMM dd, yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		printFrame();
		System.out.println("|   Type   |  ID   |        Brand         |   Price   |  Date Available  | Notes  |");
		for(Phone temp : setPhone) {
			printFrame();		
			String date = simpleDateFormat.format(temp.getDateAvailable());
			
			if (temp instanceof Smart)
				System.out.printf("| %-9s| %s | %-20s | $%5s.2f   | %s     | %.2f   |%n",
						temp.getName(), temp.getId(),temp.getBrand(), temp.getPrice(), date, ((Smart) temp).getCpuSpeed());
			else if(temp instanceof Wireless)
				System.out.printf("| %-9s| %s | %-20s | $%5.2f   | %s     | %.2f  |%n",
						temp.getName(), temp.getId(),temp.getBrand(), temp.getPrice(), date, ((Wireless) temp).getRange());
			else if(temp instanceof IPPhone)
				System.out.printf("| %-9s| %s | %-20s | $%5.2f   | %s     | %s    |%n",
						temp.getName(), temp.getId(),temp.getBrand(), temp.getPrice(), date, ((IPPhone) temp).getProtocol());
		}
	}
}
