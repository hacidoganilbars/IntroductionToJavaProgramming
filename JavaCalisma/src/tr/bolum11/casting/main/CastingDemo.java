package tr.bolum11.casting.main;

import tr.bolum11.casting.circle.Circle;
import tr.bolum11.casting.rectangle.Rectangle;

public class CastingDemo {
	public static void main(String[] args) {
		Object obj1 = new Circle(1);
		Object obj2 = new Rectangle(1, 1);

		displayObject(obj1);
		displayObject(obj2);
	}

	private static void displayObject(Object object) {
		if (object instanceof Circle) {
			System.out.println("The circle area is: " + ((Circle) object).getArea());
			System.out.println("The circle diameter is: " + ((Circle) object).getDiameter());
		} else if (object instanceof Rectangle) {
			System.out.println("The rectangle area is: " + ((Rectangle) object).getArea());
		}

	}

}
