package tr.bolum11.casting.circle;

import tr.bolum11.casting.geo.SimpleGeometricObject;

public class Circle extends SimpleGeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public void printCircle() {
		System.out.println("The circle is created: " + getDateCreated() + " and the radius is: " + radius);
	}

	@Override
	public String toString() {
		return super.toString() + "\nradius is: " + radius;
	}
}
