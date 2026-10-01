package streamAPIPrograming;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate1 {

	public static void main(String[] args) {
		
		String dateString = "22/07/2026";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date = LocalDate.parse(dateString, formatter);
		
		System.out.println("Date is: " +date);

	}

}
