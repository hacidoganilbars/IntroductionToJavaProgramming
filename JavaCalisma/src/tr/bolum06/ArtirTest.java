package tr.bolum06;

public class ArtirTest {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Haci Dogan İlbars: " + x);
		arttir(x);
		System.out.println("Haci Dogan İlbars: " + x + " değişmedi");
		System.out.println("=======================================================");

		int arra[] = new int[3];
		arra[0] = 1;
		arra[1] = 2;
		arra[2] = 3;
		System.out.println(arra[0]);
		degistir2(arra);
		System.out.println(arra[0]);
		
		System.out.println("##########################");
		System.out.println(arra);
		int arr[] = { 1, 2, 3 };
		// System.out.println(arr[0]);
		// System.out.println(arr[1]);
		// degistir(arr);
		// System.out.println(arr[0]);
		// System.out.println(arr[1]);
	}

	private static void degistir2(int[] is) {
		is[0] = 3;
		is[1] = 12;
		is[2] = 66;

	}

	// private static void degistir(int[] arr) {
	// arr[0] = 7;
	//
	// }

	private static void arttir(int x) {
		x++;
		System.out.println("metodun içindeki x " + x);
	}

}
