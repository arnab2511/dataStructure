/**
 * 
 */
package com.datastructure.list;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author arnab.chakraborty
 * Remove duplicates from Linked List
 */
public class RemoveDupLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleLinkedList sl = new SingleLinkedList();
		
	}
	
	private static void removeDuplicates(List<String> list){
		
		Set<String> remDups = new HashSet<String>();
		for (String s:list){
			remDups.add(s);
		}
     		
		List<String> unique = new LinkedList<String>(remDups);
		
	}
	
	

}
