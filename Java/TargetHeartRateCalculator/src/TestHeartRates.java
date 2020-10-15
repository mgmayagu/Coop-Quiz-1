import java.util.Scanner;

public class TestHeartRates {
	//This class contains the main method to prompt for input and generate output.
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		HeartRates patient = new HeartRates();
		
		System.out.print("Person's First Name: ");
		String firstName = input.nextLine();
		
		System.out.print("Person's Last Name: ");
		String lastName = input.nextLine();
		
		System.out.print("Person's Year of birth: ");
		int yearOfBirth = input.nextInt();
		
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		patient.setYearOfBirth(yearOfBirth);
		
		
		System.out.printf("\nPerson's First Name: %s%n", patient.getFirstName());
		System.out.printf("Person's First Name: %s%n", patient.getLastName());
		System.out.printf("Age: %d%n", patient.calculateAge());
		System.out.printf("Maximun Heart: %d%n", patient.maxHeartRate());
		System.out.printf("Target heart rate range: %d - %d", patient.lowerTargetHeartRate(), patient.higherTargetHeartRate());
		
		input.close();
	}
}