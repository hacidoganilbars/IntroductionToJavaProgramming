package com.doganilbars.collections004;

public class Rectangle extends GeometricObject {
	public double width;
	public double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void getHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public void printRectangle() {
		System.out.println(
				"The rectangle is created: " + super.getDateCreated() + "\nwidth: " + width + "\nheight: " + height);
	}

}
