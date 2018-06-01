package tr.bolum10.replaceall;

public class Islem {
	public static void main(String[] args) {
		String s = "a+b$#c".replaceAll("[$+#]", "NNN");
		System.out.println(" \"a+b$#c\".replaceAll(\"[$+#]\", \"NNN\"): " + s);
	}
}
