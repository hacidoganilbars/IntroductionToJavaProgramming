package tr.bolum10.factorial;

import java.math.BigInteger;

public class LargeFactorialIslem {
	public static void main(String[] args) {

		System.out.println("50! = " + factorial(50));

	}

	private static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		return result;
	}
}
