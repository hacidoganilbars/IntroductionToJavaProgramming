package tr.bolum10.stringandarrays;

public class GetCharsIslem {
	public static void main(String[] args) {
		char[] dst = { 'J', 'A', 'V', 'A', '1', '3', '0', '1' };
		"CS3720".getChars(2, 6, dst, 4);
		// for (int i = 0; i < dst.length; i++) {
		// System.out.println(dst[i]);
		// }

		// char arrayini string'e dönüþtürür
		String str = new String(dst);
		System.out.println(str);

		// char arrayini string'e dönüþtürür
		String strValue = String.valueOf(dst);
		System.out.println(strValue);
	}
}
