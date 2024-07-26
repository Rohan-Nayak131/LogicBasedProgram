package com.logic.lbp;

import java.util.Scanner;

public class L030StringPalindromeUsingStringBuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(s.equals(sb.toString())?s+ " is Palindrome":s+" is not Palindrome");
	}
}
