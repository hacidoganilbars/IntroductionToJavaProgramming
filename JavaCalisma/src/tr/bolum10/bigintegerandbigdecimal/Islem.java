package tr.bolum10.bigintegerandbigdecimal;

import java.math.BigInteger;

public class Islem {
	public static void main(String[] args) {
		BigInteger x = new BigInteger("3");
		BigInteger y = new BigInteger("7");
		BigInteger z = x.add(y);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}

}
