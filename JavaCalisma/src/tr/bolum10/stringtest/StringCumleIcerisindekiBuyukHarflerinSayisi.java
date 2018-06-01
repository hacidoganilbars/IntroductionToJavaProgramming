package tr.bolum10.stringtest;

public class StringCumleIcerisindekiBuyukHarflerinSayisi {
	public static void main(String[] args) {
		String s = "Hi, Good Morning";
		System.out.println(m(s));
	}

	private static int m(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// String icerisindeki karakterlerde buyuk harf var mý varsa kactane
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
