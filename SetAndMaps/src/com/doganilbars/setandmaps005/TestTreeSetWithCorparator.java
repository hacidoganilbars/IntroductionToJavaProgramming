package com.doganilbars.setandmaps005;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetWithCorparator {
	public static void main(String[] args) {
		Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
		set.add(new Rectangle(4, 5));
		set.add(new Circle(40));
		set.add(new Circle(40));
		set.add(new Rectangle(4, 1));
		for (GeometricObject element : set) {
			System.out.println("area = " + element.getArea());
		}
	}
}
