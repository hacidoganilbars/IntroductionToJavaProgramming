package com.doganilbars.setandmaps005;

public class Circle extends GeometricObject {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public void printCircle() {
		System.out.println("The circle is created: " + super.getDateCreated() + " and the radius is " + radius);
	}
}
