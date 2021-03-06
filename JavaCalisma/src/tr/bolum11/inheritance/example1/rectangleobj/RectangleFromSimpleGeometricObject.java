package tr.bolum11.inheritance.example1.rectangleobj;

import tr.bolum11.inheritance.example1.geobj.SimpleGeometricObject;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double width;
	private double height;

	public RectangleFromSimpleGeometricObject() {
	}

	public RectangleFromSimpleGeometricObject(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
		this.height = height;
		this.width = width;
		setColor(color);
		setFilled(filled);
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

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

}
