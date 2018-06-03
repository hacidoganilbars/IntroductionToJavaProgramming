package tr.bolum11.arraylist;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(1);
		System.out.println(list.toString());
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("ahmet");
		list1.add("mehmet");
		list1.add("Veli");
		list1.remove("ahmet");
		System.out.println(list1.toString());
	}

}
