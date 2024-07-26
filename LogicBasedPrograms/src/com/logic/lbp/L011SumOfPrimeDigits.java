/*     29415 -> 2+5 ->7*/


package com.logic.lbp;

import java.util.Scanner;

public class L011SumOfPrimeDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),digit,sum=0;
		
		while(n != 0) {
			digit =n % 10;
			if(digit == 2 || digit == 3 || digit == 5 || digit == 7)
				sum = sum + digit;
			n=n/10;
		}
		System.out.println(sum);
	}
}