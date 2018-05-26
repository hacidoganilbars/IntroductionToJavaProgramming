package tr.bolum02.egzersiz;

/*
 * float olarak verilen iki sayiyi integer'a cevirip ikinci degeri ilk degerin ustu yapip
 * listelemek
 * 
 * a 		b 		pow(a, b)
 * 1        2          1
 * 2        3          8
 * 3        4          81 
 * ......................
 * 
 * gibi
 */
public class Cevap018 {
	public static void main(String[] args) {
		float a = 1.0f;
		float b = 2.0f;
		System.out.println("a 		b 		pow(a, b)");
		System.out.println((int) a + " 		" + (int) b + " 		   " + (int) Math.pow(a, b));
		a++;
		b++;
		System.out.println((int) a + " 		" + (int) b + " 		   " + (int) Math.pow(a, b));
		a++;
		b++;
		System.out.println((int) a + " 		" + (int) b + " 		   " + (int) Math.pow(a, b));
		a++;
		b++;
		System.out.println((int) a + " 		" + (int) b + " 		   " + (int) Math.pow(a, b));
		a++;
		b++;
		System.out.println((int) a + " 		" + (int) b + " 		   " + (int) Math.pow(a, b));

	}

}
