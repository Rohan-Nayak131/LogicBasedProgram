/*
 * Create a function that takes a word and returns true if the word has two
 * consecutive identical letters
 * loop-->true
 * yummy-->true
 * orange-->false
 */

package com.logic.lbp;

import java.util.Scanner;

public class L067DoubleLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean found=false;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1))
			{
				found=true;
				break;
			}
		}
		System.out.println(found);
	}
}
