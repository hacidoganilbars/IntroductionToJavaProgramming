package tr.bolum10.stringtest;

public class Islem4 {
	private String text;

	public Islem4(String s) {
		text = s;
	}

	public static void main(String[] args) {
		Islem4 test = new Islem4("Hacý Doðan Ýlbars");
		System.out.println(test);
		System.out.println(test.text.toLowerCase());

	}

}
