package tr.bolum09.nesnereferansiswap;

public class Islem4 {
	public static void main(String[] args) {
		Tt t1 = new Tt();
		Tt t2 = new Tt();

		System.out.println("t1.i = " + t1.i + "\nt1.j = " + t1.j);
		System.out.println("\nt2.i = " + t2.i + "\nt2.j = " + t2.j);
	}
}

class Tt {
	static int i = 0;
	int j = 0;

	Tt() {
		i++;
		j = 1;
	}
}
