
/*madam palindrom*/

package com.logic.lbp;

import java.util.Scanner;

public class L030StringPalindromOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int low=0;
		int high=s.length()-1;
		boolean pali=true;
		while(low<=high) {
			if(s.charAt(low) != s.charAt(high)) {
				pali=false;
			break;
			}
			low++;
			high--;
		}
		
		if(pali)
			System.out.println("The string is palindrome");
		else
			System.out.println("the string is not palindrome");
	}
}
