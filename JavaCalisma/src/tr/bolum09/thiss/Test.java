package tr.bolum09.thiss;

public class Test {
	private int id;

	public void m1() {
		id = 45;
	}

	public void m2() {
		this.id = 60;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
		test.m2();
		System.out.println(test.id);
	}
}
