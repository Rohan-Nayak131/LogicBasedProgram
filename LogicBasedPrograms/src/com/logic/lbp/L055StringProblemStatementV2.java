package com.logic.lbp;

import java.util.Scanner;

public class L055StringProblemStatementV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		if(s2.length()<=s1.length()) {
			String subString=s1.substring(s1.length()-s2.length());
			System.out.println(subString.equals(s2));
		}
		else
			System.out.println(false);
	}
}
