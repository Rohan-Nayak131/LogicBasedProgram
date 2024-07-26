/*It is aksing two digit number
calculate 1's place =n%10
calculate 10's place=(n/10)%10
calculate 100's place=(n/100)%10
*/


package com.logic.lbp;

import java.util.Scanner;

public class L023SpecialTwoDigitNumberV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a,b;
		
		a=num%10;
		b=(num/10)%10;
		
		if (num == ((a+b)+(a*b)))
			System.out.println(num+" is a Special Two DIgit NUmber");
		else
			System.out.println(num+" is not a special two digit number");
	}
	
}
