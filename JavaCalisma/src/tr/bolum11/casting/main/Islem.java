package tr.bolum11.casting.main;

import tr.bolum11.casting.circle.Circle;
import tr.bolum11.casting.geo.SimpleGeometricObject;

public class Islem {
	public static void main(String[] args) {
		Circle circle=new Circle(1);
		SimpleGeometricObject sgo=new SimpleGeometricObject();
		System.out.println(circle instanceof SimpleGeometricObject);
		System.out.println(sgo instanceof SimpleGeometricObject);
		System.out.println(circle instanceof Circle);
		System.out.println(sgo instanceof Circle);
	}

}
