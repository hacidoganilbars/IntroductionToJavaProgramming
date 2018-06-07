package tr.bolum13.abstractclass.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println("Current time is: " + new Date());
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Month: " + calendar.get(Calendar.MONTH));
		System.out.println("Date: " + calendar.get(Calendar.DATE));
		System.out.println("Hour: " + calendar.get(Calendar.HOUR));
		System.out.println("Hour of day: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
		System.out.println("Second: " + calendar.get(Calendar.SECOND));
		System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of month: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of year: " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("Week of month: " + calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week of year: " + calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Am pm: " + calendar.get(Calendar.AM_PM));

		Calendar calendar1 = new GregorianCalendar(2011, 8, 11);
		String[] dayNameOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("September 11, 2001 is a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) + 1]);
	}

}
