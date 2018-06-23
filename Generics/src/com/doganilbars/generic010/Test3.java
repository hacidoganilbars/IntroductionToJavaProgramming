package com.doganilbars.generic010;

public class Test3 {
	public static void main(String[] args) {

		Circle circle1 = new Circle(3);
		Circle circle2 = new Circle(2);
		Circle circle3 = new Circle(3);

		System.out.println("equalArea1");
		System.out.println(Test3.equalArea1(circle1, circle2));
		System.out.println(Test3.equalArea1(circle1, circle3));
		System.out.println(Test3.equalArea1(circle2, circle3));

		System.out.println();

		System.out.println("equalArea1");
		System.out.println(Test3.equalArea2(circle1, circle2));
		System.out.println(Test3.equalArea2(circle1, circle3));
		System.out.println(Test3.equalArea2(circle2, circle3));

	}

	public static <E extends GeometricObject> boolean equalArea1(E object1, E object2) {
		return object1.getArea() == object2.getArea();
	}

	public static boolean equalArea2(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

}
