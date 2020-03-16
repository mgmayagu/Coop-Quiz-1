/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Target_Heart_Rate_calculator;
import java.util.Scanner;
/**
 *
 * @author michaelmayaguari
 */
public class HeartRates {

    /**
     * This class contains the main method to prompt for input and generate output.
     * @param args
     */
    public static void main(String[] args) {

        Scanner input;
        input = new Scanner(System.in);
        HeartRate patient = new HeartRate();

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
        System.out.printf("Target heart rate range: %d - %d %nmike", patient.lowerTargetHeartRate(), patient.higherTargetHeartRate());

        input.close();
    }
    
}
