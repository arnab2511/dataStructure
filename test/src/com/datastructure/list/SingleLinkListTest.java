/**
 * 
 */
package com.datastructure.list;

/**
 * @author arnab.chakraborty
 *
 */
public class SingleLinkListTest {

	public static SingleLinkedList crunchifyList;
	 
	public static void main(String[] args) {
 
		// Default constructor - let's put "0" into head element.
		crunchifyList = new SingleLinkedList();
 
		// add more elements to LinkedList
		crunchifyList.add("11");
		crunchifyList.add("22");
		crunchifyList.add("33");
		crunchifyList.add("44");
		crunchifyList.add("55");
 
		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */
 
		System.out.println("Print: crunchifyList: \t\t" + crunchifyList);
		System.out.println(".size(): \t\t\t\t" + crunchifyList.size());
		System.out.println(".get(3): \t\t\t\t" + crunchifyList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + crunchifyList.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + crunchifyList.get(4) + " (get element at index:4 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + crunchifyList.size());
		System.out.println("Print again: crunchifyList: \t" + crunchifyList);
	}

}
