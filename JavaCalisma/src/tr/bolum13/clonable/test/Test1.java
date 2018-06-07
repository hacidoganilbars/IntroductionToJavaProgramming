package tr.bolum13.clonable.test;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("New York");
		ArrayList<String> list1 = list;
		@SuppressWarnings("unchecked")
		ArrayList<String> list2 = (ArrayList<String>) list.clone();
		list.add("Atlanta");

		System.out.println("list==list1 is " + (list == list1));
		System.out.println("list==list2 is " + (list == list2));
		System.out.println("list is " + list);
		System.out.println("list1 is " + list1);
		System.out.println("list2 is " + list2);
		System.out.println("list2.get(0) is " + list2.get(0));
		System.out.println("list2.size() is " + list2.size());
	}

}
