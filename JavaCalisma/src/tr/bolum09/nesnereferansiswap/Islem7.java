package tr.bolum09.nesnereferansiswap;

import java.util.Date;

public class Islem7 {
	public static void main(String[] args) {
		Date date = new Date(1234567);
		m1(date);
		System.out.println(date.getTime());
	}

	public static void m1(Date date) {
		date.setTime(7654321);

	}

}
