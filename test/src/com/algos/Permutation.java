/**
 * 
 */
package com.algos;

import java.util.Arrays;

/**
 * @author arnab.chakraborty
 * 
 * Given 2 Strings check if one is permutation of the other.
 *
 */
public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutations("Abiiso","Abiiso"));
	}
	
	public static boolean permutations(String a,String b){
		boolean permutePossible = false;
		
		if (a.length()==b.length()){
		char[] charsA = a.toCharArray();
		char[] charsB = b.toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);
        permutePossible = Arrays.equals(charsA, charsB);

		}
		return permutePossible;
	}
	
	public static boolean permutationsB(String a,String b){
		boolean permutePossible = false;
		
		if (a.length()==b.length()){
		char[] charsA = a.toCharArray();
		char[] charsB = b.toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);
        permutePossible = Arrays.equals(charsA, charsB);

		}
		return permutePossible;
	}

}
