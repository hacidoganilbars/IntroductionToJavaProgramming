package tr.bolum10.wraps;

public class ParseIntRadix {
	public static void main(String[] args) {
		// Integer.parseInt("12", 2); bu istisna firlatir cunku 12 binary(ikilik) degil
		System.out.println(Integer.parseInt("11", 2));// returns 3
		System.out.println(Integer.parseInt("12", 8));// returns 10
		System.out.println(Integer.parseInt("13", 10));// returns 13
		System.out.println(Integer.parseInt("1A", 16));// returns 26

		// onluk sayiyi 16lik sayiya bu sekilde cevirilebildigini unutma!!
		System.out.println(String.format("%x", 26));// returns 1a
	}
}
