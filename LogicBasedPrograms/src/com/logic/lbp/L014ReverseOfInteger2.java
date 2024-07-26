package com.logic.lbp;

import java.util.Scanner;

public class L014ReverseOfInteger2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),digit;
		while(n != 0) {
			digit = n % 10;
			System.out.print(""+digit);
			n=n/10;
		}
	}
}
