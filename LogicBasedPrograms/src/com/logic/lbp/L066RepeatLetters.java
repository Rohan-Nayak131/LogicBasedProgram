/*
 * String--->SSttrriinngg
 */

package com.logic.lbp;

import java.util.Scanner;

public class L066RepeatLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			/*
			 * When you add two characters together in Java, 
			 * their Unicode values are summed up. 
			 * So if s.charAt(i) returns the character 'a', 
			 * then 'a' + 'a' is evaluated as (int)'a' + (int)'a'.
			 * The resulting sum is then converted back to a character 
			 * using the Unicode value. 
			 * So if 'a' + 'a' equals 194, then the corresponding 
			 * character for 194 might not be what you expect.
			 */
			//System.out.print(s.charAt(i)+s.charAt(i));
			
			System.out.print(s.charAt(i)+""+s.charAt(i));
		}
	}
}
