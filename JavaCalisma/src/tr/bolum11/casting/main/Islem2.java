package tr.bolum11.casting.main;

import tr.bolum11.casting.circle.Circle;
import tr.bolum11.casting.geo.SimpleGeometricObject;

//derlenemez
public class Islem2 {
	public static void main(String[] args) {
		SimpleGeometricObject object = new SimpleGeometricObject();
		Circle circle = (Circle) object;
		circle.setRadius(3);
		circle.setColor("blue");
		circle.setFilled(true);
		System.out.println(circle.getArea());
	}

}
