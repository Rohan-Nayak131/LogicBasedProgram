package com.logic.lbp;

import java.util.Scanner;

public class L014ReverseOfInteger1 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),digit;
		String s="";
		while(n != 0) {
			digit=n % 10;
			s=s+digit;
			n=n/10;
		}
		System.out.println(s);
	}
}
