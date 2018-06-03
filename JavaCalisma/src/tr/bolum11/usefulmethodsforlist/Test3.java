package tr.bolum11.usefulmethodsforlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test3 {
	public static void main(String[] args) {
		Integer[] array = { 3, 5, 95, 4, 15, 34, 3, 6, 5 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}

}
