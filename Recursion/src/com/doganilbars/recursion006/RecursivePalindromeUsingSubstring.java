package com.doganilbars.recursion006;

public class RecursivePalindromeUsingSubstring {
	public static void main(String[] args) {
		System.out.println("Is moon a Palindrome? " + isPalindrome("moon"));
		System.out.println("Is noon a Palindrome? " + isPalindrome("noon"));
		System.out.println("Is a a Palindrome? " + isPalindrome("a"));
		System.out.println("Is ab a Palindrome? " + isPalindrome("ab"));
	}

	private static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		} else if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		} else {
			return isPalindrome(s.substring(1, s.length() - 1));
		}
	}

}
