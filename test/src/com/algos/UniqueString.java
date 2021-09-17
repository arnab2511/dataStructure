package com.algos;

import java.util.Arrays;

/*The String has all the unique charecters.Witout the use of any Data Structure.*/

public class UniqueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uniqueString("coolers");
		System.out.println("The String is Unique = "+uniqueString("Smer"));
	}
	
	public static boolean uniqueString(String s){
		boolean unique = true;
		String temp = "";
		
		for (int i = 0;i<s.length();i++){
			temp = s.substring(i, i+1);
			int j = s.lastIndexOf(temp);
			//System.out.println("The index count "+j);

			if (j!=i && j!=-1){
				unique = false;
				break;
			}
			j=-1;
			
		}
		return unique;
		
	}
	
	boolean uniqueCharacters(String str)
    {
        char[] chArray = str.toCharArray();
 
        // Using sorting
        // Arrays.sort() uses binarySort in the background
        // for non-primitives which is of O(nlogn) time complexity
        Arrays.sort(chArray);
 
        for (int i = 0; i < chArray.length - 1; i++) {
            // if the adjacent elements are not
            // equal, move to next element
            if (chArray[i] != chArray[i + 1])
                continue;
 
            // if at any time, 2 adjacent elements
            // become equal, return false
            else
                return false;
        }
        return true;
    }

}
