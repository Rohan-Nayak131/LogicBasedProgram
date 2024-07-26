package com.logic.lbp;

import java.util.Scanner;

public class L017PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),r=0,digit;
		int n1=n;
		while(n != 0) {
			digit=n % 10;
			r=r*10+digit;
			n=n/10;
		}
		
		if(n1 == r)
			System.out.println(n1+" is Palindrome");
		else
			System.out.println(n1+" is not Palindrome");
	}
}
