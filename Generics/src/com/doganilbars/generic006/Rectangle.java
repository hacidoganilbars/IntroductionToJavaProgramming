package com.doganilbars.generic006;

public class Rectangle extends GeometricObject {
	private double height;
	private double width;

	public Rectangle() {
		height = 1;
		width = 1;
	}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {

		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
