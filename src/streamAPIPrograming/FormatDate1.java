package streamAPIPrograming;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate1 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2026, 10, 20);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String result = date.format(formatter);
		
		System.out.println("Formatted date is: " +result);

	}

}
