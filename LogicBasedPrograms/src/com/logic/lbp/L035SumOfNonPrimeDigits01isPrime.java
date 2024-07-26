package com.logic.lbp;

import java.util.Scanner;

public class L035SumOfNonPrimeDigits01isPrime {

	
	public static int sum(int num) {
		int sum=0;
		int d;
		
		while(num != 0) {
			d=num % 10;
			if(d==4 || d==6 || d==8 || d==9)
				sum=sum+d;
			num=num/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum=sum(num);
		System.out.println("The sum of Non Prime digits is "+sum);
	}
}
