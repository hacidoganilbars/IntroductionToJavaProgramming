package tr.bolum11.inheritance.example2.employee;

import tr.bolum11.inheritance.example2.person.Person;

public class Employee extends Person {
	public Employee() {
		this("(2) Invoke Employee's overloaded constructor");
		System.out.println("(3) Performs Employee's tasks ");
	}

	public Employee(String s) {
		System.out.println(s);
	}
}
