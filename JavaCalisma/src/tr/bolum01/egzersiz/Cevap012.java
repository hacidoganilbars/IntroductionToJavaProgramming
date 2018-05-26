package tr.bolum01.egzersiz;

/*
 * ax + by = e
 * cx + dy = f
 * 
 * x=(ed - bf)/(ad - bc)
 * y=(af - ec)/(ad - bc)
 * 
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 * 
 * x=?
 * y=?
 */
public class Cevap012 {
	public static void main(String[] args) {
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x +  .55y =  5.9");
		System.out.println("\n        (44.5 * .55) - (50.2 * 5.9)");
		System.out.println(" x =  -------------------------------");
		System.out.println("         (3.4  * .55) - (50.2 * 2.1)\n");
		System.out.println("x = " + (((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))));
		System.out.println("\n");
		System.out.println("       (3.4 * 5.9) - (44.5 * 2.1)");
		System.out.println(" y =  -----------------------------");
		System.out.println("       (3.4 * .55) - (50.2 * 2.1)\n");
		System.out.println("y = " + (((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1))));

	}
}
