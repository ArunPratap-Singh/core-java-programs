package timeAndDateAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {

	public static void main(String[] args) {
	
		LocalDate date = LocalDate.of(2026, 10, 02);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String result = date.format(formatter);
		
		System.out.println("Formatted Date is: " +result);

	}

}
