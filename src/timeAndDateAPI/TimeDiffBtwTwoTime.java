package timeAndDateAPI;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDiffBtwTwoTime {

	public static void main(String[] args) {
		
		LocalTime Starttime = LocalTime.of(14, 25, 54);
		
		LocalTime Endtime = LocalTime.of(22, 45, 59);
		
		Duration duration = Duration.between(Starttime, Endtime);
		
		System.out.println("StartTimeis: " +Starttime);
		System.out.println("End Time is: " +Endtime);
		
		System.out.println("Hour is: " +duration.toHours());
		System.out.println("===========");
		System.out.println("Minutes is: " +duration.toMinutes());
		System.out.println("=============");
		System.out.println("Seconds is: " +duration.toSeconds());

	}

}
