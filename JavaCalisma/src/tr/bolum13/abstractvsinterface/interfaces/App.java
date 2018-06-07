package tr.bolum13.abstractvsinterface.interfaces;

public class App {
	public static void main(String[] args) {
		Edible stuff = new Chicken();
		eat(stuff);
		stuff = new Duck();
		eat(stuff);
		stuff = new Broccoli();
		eat(stuff);
	}

	public static void eat(Edible stuff) {
		System.out.println(stuff.howToEat());
	}

}
