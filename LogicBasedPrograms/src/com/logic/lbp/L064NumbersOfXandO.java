/*
 * Create a function that returns a string ,check if it has same number of 
 * X's and O's and return either true or false
 */


package com.logic.lbp;

import java.util.Scanner;

public class L064NumbersOfXandO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int xc=0,oc=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'x' || s.charAt(i) == 'X')
				xc++;
			if(s.charAt(i) == 'o' || s.charAt(i) == 'O')
				oc++;
		}
		System.out.println(xc==oc);
		sc.close();
	}
}
