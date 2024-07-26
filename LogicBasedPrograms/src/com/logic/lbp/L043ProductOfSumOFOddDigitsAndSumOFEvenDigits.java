package com.logic.lbp;

import java.util.Scanner;

public class L043ProductOfSumOFOddDigitsAndSumOFEvenDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sumEven=0,sumOdd=0;
		while(num != 0) {
			if((num % 10) % 2 ==0  )
				sumEven=sumEven+(num % 10);
			else
				sumOdd=sumOdd+(num % 10);
			num=num/10;
		}
		System.out.println(sumEven * sumOdd);
	}
}
