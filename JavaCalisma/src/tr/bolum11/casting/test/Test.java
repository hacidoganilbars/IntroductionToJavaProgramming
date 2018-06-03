package tr.bolum11.casting.test;

public class Test {
	public static void main(String[] args) {
		Object fruit = new Fruit();
		Fruit apple = (Apple) fruit;

	}
}

class Apple extends Fruit {
	public Apple() {
		System.out.println("Apple");
	}
}

class Fruit {
	public Fruit() {
		System.out.println("Fruit");
	}

}