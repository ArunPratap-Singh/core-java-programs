package streamAPIPrograming;

import java.time.LocalDate;

public class WhichDateIsEarlier {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2026, 10, 02);
		LocalDate date2 = LocalDate.of(2026,07, 10);
		
		if(date1.isBefore(date2)) {
			System.out.println(date1 + " is Earlier ");
		}else {
			System.out.println(date2 + " is Earlier") ;
		}

	}

}
