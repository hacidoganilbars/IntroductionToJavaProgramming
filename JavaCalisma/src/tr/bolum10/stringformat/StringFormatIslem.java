package tr.bolum10.stringformat;

public class StringFormatIslem {
	public static void main(String[] args) {

		String s = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
		System.out.println(s);
	}

}
