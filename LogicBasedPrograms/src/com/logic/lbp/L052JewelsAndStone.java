/*
 * input strings   aA
 *                 AAabbba
 * 				   a=2,A=2 total 4
 * z
 * ZZZ
 * z=0 total 0
 */
package com.logic.lbp;

import java.util.Scanner;

public class L052JewelsAndStone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int c=0;
		for(int i=0;i<s1.length();i++) {
			
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)== s2.charAt(j))
				c++;	
			}
		}
		System.out.println(c);
	}
	
}
