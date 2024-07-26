package com.logic.lbp;

import java.util.Scanner;

public class L029PrimeNumbers {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int fact=0,n;
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n % i == 0)
				fact++;
		}
		if(fact == 2)
			System.out.println("The number "+n+" is a Prime number");
		else
			System.out.println("The number "+n+" is not a prime number");
	}
}
