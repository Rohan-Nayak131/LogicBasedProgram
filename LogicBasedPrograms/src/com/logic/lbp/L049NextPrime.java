
/*
 * input 10
 * next prime is 11
 * 
 *  input 20
 *  next prime is 23
 */

package com.logic.lbp;

import java.util.Scanner;

public class L049NextPrime {

	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num % i == 0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n=num;
		while(true) {
			if(isPrime(n)) {
				System.out.println("The next prime of "+num+" is "+n);
				break;
			}
				n++;
		}
	
	}
}
