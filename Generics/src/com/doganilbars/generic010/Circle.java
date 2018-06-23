package com.doganilbars.generic010;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

}
