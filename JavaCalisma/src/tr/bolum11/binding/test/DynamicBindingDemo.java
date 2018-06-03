package tr.bolum11.binding.test;

import tr.bolum11.binding.graduatestudent.GraduateStudent;
import tr.bolum11.binding.person.Person;
import tr.bolum11.binding.student.Student;

public class DynamicBindingDemo {
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}

	private static void m(Object obj) {
		System.out.println(obj.toString());

	}

}
