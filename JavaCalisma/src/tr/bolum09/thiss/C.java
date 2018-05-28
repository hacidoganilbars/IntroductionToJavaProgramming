package tr.bolum09.thiss;

public class C {
	private int p;

	public C() {
		this(9);
		System.out.println("C's no-arg constructor invoked");

	}

	public C(int p) {
		this.p = p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.p);
		c.setP(5);
		System.out.println(c.p);
	}

}
