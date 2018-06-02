package tr.bolum10.palindrome;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir string girin: ");
		String s = input.nextLine();
		System.out.println(s + " bir palindrom mu?: " + isPalindrome(s));
		input.close();
	}

	private static boolean isPalindrome(String s) {

		String s1 = filters(s);
		String s2 = reverse(s1);
		return s2.equals(s1);

	}

	private static String filters(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	private static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

}
