/*
 * 19 , 22
 * 
 * (1+9)+(2+0)+(2+1)+(2+2)=19
 */


package com.logic.lbp;

import java.util.Scanner;

public class L050SumOfDigitsBetweenTwoNumbers {

	public static int sumOfDigits(int num) {
		int sum=0;
		while(num != 0) {
			sum=sum+(num%10);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			
			sum=sum+sumOfDigits(i);
			
		}
		System.out.println("The sum of digits between "+num1+" and "+num2+" is "+sum);
	}
	
}
