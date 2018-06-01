package tr.bolum10.wraps;

public class DoubleCompareToDouble {
	public static void main(String[] args) {

		System.out.println(new Double(12.4).compareTo(new Double(12.3)));// 1

		System.out.println(new Double(12.3).compareTo(new Double(12.3)));// 0

		System.out.println(new Double(12.3).compareTo(new Double(12.51)));// -1
	}

}
