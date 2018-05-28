package tr.bolum09.statik;

public class Test {

	public static int faktoriyelDogruYontem(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++)
			result *= i;
		return result;
	}

	public int faktoriyelYanlisYontem(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++)
			result *= i;
		return result;
	}

	public static void main(String[] args) {
		Test test = new Test();
		int faktoriyel = test.faktoriyelYanlisYontem(5);
		System.out.println(faktoriyel);
		faktoriyel = Test.faktoriyelDogruYontem(5);
		System.out.println(faktoriyel);
	}
}