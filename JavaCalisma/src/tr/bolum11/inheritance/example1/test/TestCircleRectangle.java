package tr.bolum11.inheritance.example1.test;

import tr.bolum11.inheritance.example1.circleobj.CircleFromSimpleGeometricObject;
import tr.bolum11.inheritance.example1.rectangleobj.RectangleFromSimpleGeometricObject;

public class TestCircleRectangle {
	public static void main(String[] args) {
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
		System.out.println("A circle: " + circle.toString());
		System.out.println("The Color is: " + circle.getColor());
		System.out.println("The Radius is: " + circle.getRadius());
		System.out.println("The Area is: " + circle.getArea());
		System.out.println("The Diameter is: " + circle.getDiameter());
		System.out.println("============================================================");
		RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
		System.out.println("A rectangle: " + rectangle.toString());
		System.out.println("The Area is: " + rectangle.getArea());
		System.out.println("The Perimeter is: " + rectangle.getPerimeter());
	}

}
