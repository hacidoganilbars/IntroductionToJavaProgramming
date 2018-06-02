package tr.bolum11.polimorphism.test;

import tr.bolum11.polimorphism.circle.CircleFromSimpleGeometricObject;
import tr.bolum11.polimorphism.geo.SimpleGeometricObject;
import tr.bolum11.polimorphism.rectangle.RectangleFromSimpleGeometricObject;

public class TestCircleRectangle {
	public static void main(String[] args) {
		displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
		displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));

	}

	private static void displayObject(SimpleGeometricObject obj) {
		System.out.println("Create on: " + obj.getDateCreated() + ". Color is: " + obj.getColor());

	}

}
