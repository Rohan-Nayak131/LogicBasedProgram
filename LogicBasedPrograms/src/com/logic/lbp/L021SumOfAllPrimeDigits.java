package com.logic.lbp;

import java.util.Scanner;

public class L021SumOfAllPrimeDigits {
	
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int num=sc.nextInt();
		int d,sum=0,n=num;
		while(n != 0) {
			
			d=n % 10;
			if(d==2 || d==3 || d==5 || d==7)
				sum=sum+d;
			n=n / 10;
		}
		System.out.println("Sum of prime digits of "+num +" is "+sum);
	}
}
