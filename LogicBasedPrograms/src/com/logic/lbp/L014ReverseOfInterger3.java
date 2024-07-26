package com.logic.lbp;

import java.util.Scanner;

public class L014ReverseOfInterger3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),digit,rev=0;
		
		while(n != 0) {
			digit = n % 10;
			rev=rev*10+digit;
			n=n/10;
			
		}
		System.out.println(rev);
	}
}
