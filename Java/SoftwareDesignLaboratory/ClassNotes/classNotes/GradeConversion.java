package classNotes;

import java.util.Scanner;

public class GradeConversion {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double grade = scanner.nextDouble();
		double sum = grade;
		int counter = 1;
		while(grade != -1) {
			grade = scanner.nextDouble();
			sum += grade;
			++counter;
		}
		scanner.close();
		

		
		
	}

//}
