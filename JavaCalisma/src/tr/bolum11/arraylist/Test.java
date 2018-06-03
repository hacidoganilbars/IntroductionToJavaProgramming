package tr.bolum11.arraylist;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Osmaniye");
		list.add("Ankara");
		// list.add(new Date());
		String city = list.get(0);
		System.out.println(city);
		// list.set(3, "Ýstanbul");// IndexOutOfBoundsException

		// System.out.println(list.get(3));// IndexOutOfBoundsException
	}

}
