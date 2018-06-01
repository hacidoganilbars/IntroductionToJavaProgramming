package tr.bolum10.stringmatches;

public class Islem1 {
	public static void main(String[] args) {

		System.out.println("matches ile equals metodlari ilk bakista cok benzer.\n");
		// matches ile equals metodlari ilk bakista cok benzer
		System.out.println("\"java\".matches(\"java\") => " + "java".matches("java"));
		System.out.println("\"java\".equals(\"java\") => " + "java".equals("java"));

		System.out.println("\nancak matches daha gucludur.\n");

		// ancak matches daha gucludur
		System.out.println("\"Java developer.\".matches(\"Java.*\"): " + "Java developer.".matches("Java.*"));
		System.out.println("\"Java eglencelidir.\".matches(\"Java.*\"): " + "Java eglencelidir.".matches("Java.*"));
		System.out.println("\"java gucludur.\".matches(\"Java.*\"): " + "Java gucludur.".matches("Java.*"));

		System.out.println("\n\\\\d tek bir rakamý temsil eder ve \\\\ d {3} üç rakamý temsil eder.\n");
		// 530-221-80-87
		System.out.println("\"530-221-80-87\".matches(\"\\\\d{3}-\\\\d{3}-\\\\d{2}-\\\\d{2}\"): "
				+ "530-221-80-87".matches("\\d{3}-\\d{3}-\\d{2}-\\d{2}"));

	}
}
