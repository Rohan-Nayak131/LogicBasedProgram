package com.logic.lbp;

import java.util.Scanner;

public class L038CountSpecialCharactersinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for( int i=0;i<s.length();i++) {
			if(!((s.charAt(i)>='a' && s.charAt(i)<='z') || 
					(s.charAt(i)>='A' && s.charAt(i)<='Z') || 
					(s.charAt(i)>='0' && s.charAt(i) <= '9') || (s.charAt(i)==' '))) {
				count++;
			}
		}
		System.out.println("Total Special Characters is "+count);
	}
}
