package streamAPIPrograming;

import java.time.LocalDate;

public class StringToLocalDate {

	public static void main(String[] args) {
		
		String dateString = "2026-05-25";
		
		LocalDate date = LocalDate.parse(dateString);
		
		System.out.println("String is: " +dateString);
		System.out.println("=============");
		System.out.println("LocalDate is: " +date);

	}

}
