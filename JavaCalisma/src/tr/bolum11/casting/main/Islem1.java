package tr.bolum11.casting.main;

import tr.bolum11.casting.circle.Circle;
import tr.bolum11.casting.geo.SimpleGeometricObject;

public class Islem1 {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		SimpleGeometricObject object = circle;
		System.out.println(object.toString());
		System.out.println(((Circle) object).getArea());
	}

}
