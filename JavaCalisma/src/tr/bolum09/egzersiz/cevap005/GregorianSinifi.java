package tr.bolum09.egzersiz.cevap005;

import java.util.GregorianCalendar;

public class GregorianSinifi {
	public static void main(String[] args) {

		GregorianCalendar calender = new GregorianCalendar();

		System.out.print("\nGuncel tarih Gun/Ay/Yil: ");
		System.out.println(calender.get(calender.DAY_OF_MONTH) + "/0" + (calender.get(calender.MONTH) + 1) + "/"
				+ calender.get(calender.YEAR));

		// 1 Ocak 1970 ten 1234567898765L milisaniye sonra
		calender.setTimeInMillis(1234567898765L);

		System.out.print("\n1 Ocak 1970 ten 1234567898765L milisaniye sonra  Gun/Ay/Yil: ");
		System.out.println(calender.get(calender.DAY_OF_MONTH) + "/0" + calender.get(calender.MONTH) + "/"
				+ calender.get(calender.YEAR));
	}

}
