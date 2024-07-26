package com.logic.lbp;

import java.util.Scanner;

public class L040ReverseOfNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rev=0,d;
		while(num != 0) {
			d=num %10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println(rev);
	}
}
