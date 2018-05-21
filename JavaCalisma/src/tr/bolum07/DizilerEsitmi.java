package tr.bolum07;
import java.util.Arrays;

public class DizilerEsitmi {

	public static boolean esitMi(int[] dizi1, int[] dizi2) {
		if (dizi1 == dizi2) {
			return true;
		}

		if (dizi1 == null || dizi2 == null)
			return false;

		if (dizi1.length != dizi2.length) {
			return false;
		}

		for (int i = 0; i < dizi1.length; i++) {
			if (dizi1[i] != dizi2[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(esitMi(new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 }));

		System.out.println(Arrays.equals(new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 }));
	}

}
