package tr.bolum10.wraps;

public class CompileTest {
	public static void main(String[] args) {
		Integer i1 = new Integer("23");
		Integer i2 = new Integer(23);
		Integer i3 = Integer.valueOf("23");
		Integer i4 = Integer.parseInt("23", 8);
		// Double da = new Double();
		Double db = Double.valueOf("23.45");
		int ia = (Integer.valueOf("23")).intValue();
		double dc = (Double.valueOf("23.4")).doubleValue();
		int ib = (Double.valueOf("23.4")).intValue();
		String s = (Double.valueOf("23.4")).toString();

		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("i4: " + i4);
		System.out.println("db: " + db);
		System.out.println("ia: " + ia);
		System.out.println("dc: " + dc);
		System.out.println("ib: " + ib);
		System.out.println("s: " + s);
		// System.out.println(da);
	}

}
