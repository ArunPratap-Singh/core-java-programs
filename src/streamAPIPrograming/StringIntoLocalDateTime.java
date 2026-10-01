package streamAPIPrograming;

import java.time.LocalDateTime;

public class StringIntoLocalDateTime {

	public static void main(String[] args) {
		
		String dateTimeString = "2026-10-01T10:30:45";
		
		LocalDateTime dt = LocalDateTime.parse(dateTimeString);
		
		System.out.println("String is: " +dateTimeString);
		System.out.println("===========");
		System.out.println("Formatted Date is: " +dt);

	}

}
