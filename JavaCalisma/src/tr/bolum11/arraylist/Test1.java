package tr.bolum11.arraylist;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Osmaniye");
		list.add("Osmaniye");
		list.add("Ankara");
		list.add("İstanbul");
		list.add("Osmaniye");
		list.remove("Osmaniye");
		System.out.println(list.toString());// ilk indexi sildi
		for (int i = 0; i < list.size(); i++) {
			list.remove("Osmaniye");
		}
		System.out.println(list.toString());
	}

}
