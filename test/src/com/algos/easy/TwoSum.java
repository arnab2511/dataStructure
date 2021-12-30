/**
 * 
 */
package com.algos.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author arnab
 *
 */
public class TwoSum {

	/**
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 */

	/*
	 * Example 1:
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1].
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] indexes=twoSum(new int[] {2,7,11,15}, 9);
		System.out.println("The final indexes : "+Arrays.toString(indexes));
	}

	
	/*
	 * Time complexity: O(n^2)O(n 2 ). For each element, we try to find its
	 * complement by looping through the rest of the array which takes O(n)O(n)
	 * time. Therefore, the time complexity is O(n^2)O(n 2 ).
	 */
	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; i < nums.length; i++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		return null;

	}

	/*
	 * A simple implementation uses two iterations. In the first iteration, we add
	 * each element's value as a key and its index as a value to the hash table.
	 * Then, in the second iteration, we check if each element's complement (target
	 * - nums[i]target−nums[i]) exists in the hash table. If it does exist, we
	 * return current element's index and its complement's index. Beware that the
	 * complement must not be nums[i]nums[i] itself!
	 */
	public static int[] twoSumWithHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < nums.length; i++) {

			map.put(nums[i], i);

		}
		for (int i = 0; i < nums.length; i++) {

			int compliment = target - map.get(i);
			if (map.containsKey(compliment) && map.get(compliment) != i) {
				return new int[] { map.get(compliment), i };
			}

		}
		return null;

	}
	
	public static int[] twoSumWithHashMapSimplified(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap();
		/*
		 * for (int i = 0; i < nums.length; i++) {
		 * 
		 * map.put(nums[i], i);
		 * 
		 * }
		 */
		for (int i = 0; i < nums.length; i++) {

			int compliment = target - map.get(i);
			if (map.containsKey(compliment)) {
				return new int[] { map.get(compliment), i };
			}
			map.put(nums[i], i);
		}
		return null;

	}

}
