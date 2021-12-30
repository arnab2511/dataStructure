/**
 * 
 */
package com.algos.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arnab
 * 
 *         Given a string s, find the length of the longest substring without
 *         repeating characters.
 * 
 *         Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc",
 *         with the length of 3.
 *
 *
 *         Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with
 *         the length of 3. Notice that the answer must be a substring, "pwke"
 *         is a subsequence and not a substring.
 */
public class LongestSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = lengthOfLongestSubstring2("bcvabb");
		System.out.println("The length of longest string :: " + length);
	}

	public static int lengthOfLongestSubstring2(String s) {
		Map<Character, Integer> map = new HashMap();
		int res = 0;
		for (int j = 0, i = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}

			res = Math.max(res, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return res;
	}

}
