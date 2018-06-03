package tr.bolum11.usefulmethodsforlist;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] array= {"Adana","Osmaniye","Ankara"};
		ArrayList< String> list=new ArrayList<String>(Arrays.asList(array));
		System.out.println(list.toString());
	}

}
