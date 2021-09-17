/**
 * 
 */
package com.algos;

/**
 * @author arnab.chakraborty
 *
 */
public class URLify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   urilfy("The string s   ",10);
	}

	public static String urilfy(String uri,int count){		
		uri = uri.trim();
		uri = uri.replace(" ", "%");
		return uri;
		
	}
}
