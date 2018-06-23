package com.doganilbars.generic010;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Ankara");
		String state=list1.get(0);
		System.out.println(state);
		
		ArrayList list2=new ArrayList();
		list2.add("Adana");
		String state2=(String)list2.get(0);
		System.out.println(state2);
		
	}

}
