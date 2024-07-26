package com.logic.lbp;

import java.util.Scanner;

public class L032CountSpecialCharactersAndWhitespacesInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='a' && s.charAt(i)<='z') ||
					(s.charAt(i)>='A' && s.charAt(i)<'Z') ||
					(s.charAt(i)>='0' && s.charAt(i)<='9')) 
				continue;
			
			else
				c++;
		}
		System.out.println("Number of Special Characters in given string "+s +" is "+c );
	}
}
