package com.logic.lbp;

import java.util.Scanner;

public class L012SumOf3divisibleDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),digit,sum=0;
		
		while(n != 0) {
			digit= n % 10;
			if(digit % 3==0)
				sum=sum+digit;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
