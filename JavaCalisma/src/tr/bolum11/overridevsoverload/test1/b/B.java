package tr.bolum11.overridevsoverload.test1.b;

import tr.bolum11.overridevsoverload.test1.circle.Circle;

public class B extends Circle {
	private double lenght;

	public B(double radius, double lenght) {
		super(radius);
		this.lenght=lenght;

	}
	@Override
	public double getArea() {
		return super.getArea()*lenght;
	}

}
