/*
 * Valid zip code rules
 * 1.it must contain only numbers
 * 2.does not have space
 * 3.length should be 5
 */

package com.logic.lbp;

import java.util.Scanner;

public class L073ValidZipCodeV1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String zip=scanner.nextLine();
		int c=0;
		
			for(int i=0;i<zip.length();i++) {
				if(!(zip.charAt(i) >= '0' && zip.charAt(i) <= '9')) 
					break;
				else
					c++;
			}
		if(c==5)
			System.out.println("Valid Zip");
		else
			System. out.println("Invalid zip");
	}
}
