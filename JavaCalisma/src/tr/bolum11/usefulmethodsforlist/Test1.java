package tr.bolum11.usefulmethodsforlist;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Adana");
		list.add("Osmaniye");
		list.add("Ýstanbul");
		list.add("Rize");
		
		String[] array=new String[list.size()];
		list.toArray(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
