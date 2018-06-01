package tr.bolum10.stringsplit;

public class TokensIslem {
	public static void main(String[] args) {

		String[] tokens = "Java#Html#Android#C++#C".split("#");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i] + " ");
		}
	}
}
