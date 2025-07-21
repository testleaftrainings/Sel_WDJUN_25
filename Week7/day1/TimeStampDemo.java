package week7.day1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampDemo {

	public static void main(String[] args) {

		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy_hh_mm_ss_a");
		String timeStamp = currentTime.format(dateFormat);
		System.out.println(timeStamp);
		
	}

}
