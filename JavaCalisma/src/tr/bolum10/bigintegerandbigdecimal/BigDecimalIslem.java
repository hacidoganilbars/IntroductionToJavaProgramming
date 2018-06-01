package tr.bolum10.bigintegerandbigdecimal;

import java.math.BigDecimal;

public class BigDecimalIslem {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1.0");
		BigDecimal b = new BigDecimal("3");
		BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);
		System.out.println(c);

	}

}
