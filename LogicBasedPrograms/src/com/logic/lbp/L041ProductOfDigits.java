package com.logic.lbp;

import java.util.Scanner;

public class L041ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),d,p=1;
		while(n != 0) {
			d=n % 10;
			p=p*d;
			n=n/10;
		}
		System.out.println("Product of digits "+p);
	}
}
