package com.logic.lbp;

import java.util.Scanner;

public class L033SumOfOddDigits {

	public static  int findSum(int n) {
		int d,sum=0;
		while(n != 0) {
			d=n%10;
			if(d % 2 != 0)
				sum=sum+d;
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(findSum(n));
	}
}
