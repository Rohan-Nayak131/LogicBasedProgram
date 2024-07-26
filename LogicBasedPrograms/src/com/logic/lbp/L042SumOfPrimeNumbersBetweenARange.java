package com.logic.lbp;

import java.util.Scanner;

public class L042SumOfPrimeNumbersBetweenARange {

	public static boolean isPrime(int n) {
		int fact=0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0 )
				fact++;
		}
		
		return fact == 2;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			if(isPrime(i))
				sum=sum+i;
		}
		System.out.println(sum);
	}
}
