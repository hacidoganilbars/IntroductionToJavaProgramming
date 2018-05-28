package tr.bolum09.nesnedizisi;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(1234567);
		Date date2 = new Date(99997654321L);
		Date[] dates = new Date[10];
		dates[0] = date1;
		dates[1] = date2;
		System.out.println(dates[0]);
		System.out.println(dates[1].toString());
	}

}
