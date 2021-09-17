/**
 * 
 */
package com.algos;

/**
 * @author arnab.chakraborty
 *  Print all the palindromic permutations of given string in alphabetic order
 *
 */
/**
 * @author arnab.chakraborty
 * 
 */
public class PalindromePermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkIfEditable("aabb", "abbbbb"));
	}

	public static void printPalPer(String s) {
		String palindrome = null;
		for (int i = s.length(); i <= 0; i--) {

			String temp = s.substring(i);
			palindrome = temp + palindrome;

		}
	}

	public static String getPalindrome(String s) {
		String palindrome = null;
		for (int i = s.length(); i <= 0; i--) {

			String temp = s.substring(i);
			palindrome = temp + palindrome;

		}
		if (!palindrome.equals(s)) {
			palindrome = "Not  A palindrome";
		}
		return palindrome;
	}

	public static boolean checkIfEditable(String a, String b) {
		char[] chArrayA = a.toCharArray();
		char[] chArrayB = b.toCharArray();
		int count = 0;
		int charALength = chArrayA.length;
		int charBLength = chArrayB.length;
		int length = chArrayA.length < chArrayB.length ? chArrayA.length
				: chArrayB.length;
		System.out.println("B length : " + (chArrayB.length));
		System.out.println("A length : " + chArrayA.length);
		if (charALength != charBLength) {
			if (charALength != charBLength -1 || charBLength != charALength - 1) {
               
				return false;
		}
		}
		for (int i = 0; i < length; i++) {
			System.out.println("Comparing : " + chArrayA[i] + " : "
					+ chArrayB[i]);
			if (count < 2) {
				if (chArrayA[i] != chArrayB[i]) {
					count++;
					System.out.println("inside 1 : " + chArrayA[i] + " : "
							+ chArrayB[i]);
				}
			} else {
				System.out.println("inside 2");
				return false;
			}
		}
		return true;
	}

}
