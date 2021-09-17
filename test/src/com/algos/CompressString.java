/**
 * 
 */
package com.algos;

/**
 * @author arnab.chakraborty
 * 
 *
 */
public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //compressString("Tthhhtrrrhrrr");
	 System.out.println(compressString("Tthhhtrrrhrrr"));
	 //Output should be t2h3t1r3h1r3
	}
	
	public static String compressString(String s) {
		String compress = "";
		for (int i = 0; i < s.length(); i++) {
			String temp = "";
			if (s.substring(i).equals(s.substring(i + 1))) {
				temp = s.substring(i) + s.substring(i + 1);
				System.out.println("Temp iteration "+i+" : val "+temp);
				i++;
				
			} else {
				temp =  s.substring(i) + "1";
			}

			compress = compress + temp.substring(0) + temp.length();
		}
		return compress;
	}
}
