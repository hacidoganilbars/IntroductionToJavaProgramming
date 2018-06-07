package tr.bolum13.abstractvsinterface.abstracts;

public class App {
	public static void main(String[] args) {
		Animal animal1 = new Chicken();
		eat(animal1);
		animal1=new Duck();
//		Animal animal2 = new Duck();
		eat(animal1);
	}

	public static void eat(Animal animal) {
		System.out.println(animal.howToEat());
	}
}
