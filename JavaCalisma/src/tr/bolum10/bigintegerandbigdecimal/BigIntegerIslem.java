package tr.bolum10.bigintegerandbigdecimal;

import java.math.BigInteger;

public class BigIntegerIslem {
	public static void main(String[] args) {

		BigInteger a = new BigInteger("9223372036854775807");
		System.out.println("a: " + a);

		BigInteger b = new BigInteger("2");
		System.out.println("b: " + b);

		BigInteger c = a.multiply(b);// 9223372036854775807 * 2
		System.out.println("c: " + c);
	}

}
