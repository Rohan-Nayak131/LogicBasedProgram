package com.logic.lbp;

import java.util.Scanner;

public class L055StringProblemStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int i,j=s1.length()-1;
		int count=0;
		if(s2.length()<=s1.length()) {
			for(i=s2.length()-1;i>=0;i--) {
				if(s2.charAt(i)==s1.charAt(j--)) {
					count++;
					
				}
			}
		}
	
		System.out.println(count==s2.length());
	}
}


