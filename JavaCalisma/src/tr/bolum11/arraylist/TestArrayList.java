package tr.bolum11.arraylist;

import java.util.ArrayList;

import tr.bolum11.casting.circle.Circle;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Osmaniye");
		cityList.add("Adana");
		cityList.add("Ýzmir");
		cityList.add("Bursa");
		cityList.add("Rize");
		cityList.add("Trabzon");
		cityList.add("Mardin");
		cityList.add("Ankara");

		System.out.println("List size?: " + cityList.size());
		System.out.println("Is Bursa in the list?: " + cityList.contains("Bursa"));
		System.out.println("The location of Mardin in the list?: " + cityList.indexOf("Mardin"));
		System.out.println("Is the list empty?: " + cityList.isEmpty());

		cityList.add(2, "Sivas");
		cityList.remove("Rize");
		cityList.remove(1);
		System.out.println(cityList.toString());

		for (int i = cityList.size() - 1; i >= 0; i--) {
			System.out.print(cityList.get(i) + " ");
		}
		System.out.println();

		ArrayList<Circle> list = new ArrayList<Circle>();
		list.add(new Circle(2));
		list.add(new Circle(3));

		System.out.println("The area of the circle?: " + list.get(0).getArea());

	}

}
