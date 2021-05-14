package labbook3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LabPartEx34 {
	public static void main(String[] args) {
		/*	DateTimeFormatter is used to configure the date time format
			DateTimeFormatter can also be obtained by using ofPattern() 
			which you can use for custom date and time format
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input  = scanner.nextLine();
		LocalDate enteredDate = LocalDate.parse(input,formatter);
		System.out.println("Tomorrow:"+ enteredDate.plusDays(1));
		}

}
