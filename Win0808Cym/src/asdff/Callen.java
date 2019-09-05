package asdff;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Callen {

	public static void main(String[] args) {
		TimeZone tz=TimeZone.getTimeZone("america/los_angeles");
		Calendar c = new GregorianCalendar(tz);
		System.out.println(tz.getDisplayName(Locale.ENGLISH)+c.get(Calendar.HOUR));
		tz=TimeZone.getTimeZone("Asia/Seoul");
		c.setTimeZone(tz);
		System.out.println(tz.getDisplayName(Locale.KOREA)+c.get(Calendar.HOUR));
				
	System.out.println(System.nanoTime());
		
		String[] timeZone=TimeZone.getAvailableIDs();
		for(String tzone:timeZone) {
			System.out.println(tzone);
		}
	}

}
