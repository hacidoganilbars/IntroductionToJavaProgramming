package tr.bolum11.inheritance.example2.faculty;

import tr.bolum11.inheritance.example2.employee.Employee;

public class Faculty extends Employee {
	public static void main(String[] args) {
		new Faculty();
	}

	public Faculty() {
		System.out.println("(4) Performs Faculty's tasks");
	}

}
