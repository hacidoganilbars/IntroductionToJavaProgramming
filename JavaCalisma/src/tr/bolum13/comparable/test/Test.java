package tr.bolum13.comparable.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Person[] persons = { new Person(3), new Person(2), new Person(1), new Person(4) };
		Arrays.sort(persons);
		for (Person person : persons) {
			System.out.print(person.getId() + " ");
		}
	}
}

class Person implements Comparable<Person> {
	private int id;

	public Person(int id) {
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Person o) {
		if (getId() > o.getId()) {
			return 1;
		} else if (getId() < o.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}