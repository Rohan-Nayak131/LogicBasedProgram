package com.logic.lbp;

import java.util.Scanner;

public class L062FindWordV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();//WelCome
		/*
		 * WelCome
		 * 0123456
		 */
				
		
		String s1="bomb";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				c=(char)(c+32);
			}
			System.out.println(s.substring(0,i));
			System.out.println(c);
			System.out.println(s.substring(i+1));
			s = s.substring(0, i) + c + s.substring(i + 1);
			System.out.println("******************************");
		}
		System.out.println(s);
	}
}
