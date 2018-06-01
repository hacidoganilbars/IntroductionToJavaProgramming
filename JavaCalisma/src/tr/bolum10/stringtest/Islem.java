package tr.bolum10.stringtest;

public class Islem {
	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("Welcome to Java");
		String s4 = "Welcome to Java";

		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));

		System.out.println("s1.equals(s3): " + s1.equals(s3));
		System.out.println("s1.equals(s4): " + s1.equals(s4));

		String str = "Welcome to C#".replace("C#", "Java");
		System.out.println(str);

		// System.out.println(s1.replace('o', 'T'));
		// System.out.println(s1.replace("o", "T"));
		// System.out.println(s1.replaceAll("o", "T"));
		System.out.println(s1.replaceFirst("o", "T"));
		System.out.println(s1.toCharArray());
	}

}
