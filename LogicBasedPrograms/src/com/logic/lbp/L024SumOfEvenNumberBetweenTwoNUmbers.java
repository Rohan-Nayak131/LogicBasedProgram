package com.logic.lbp;

import java.util.Scanner;

public class L024SumOfEvenNumberBetweenTwoNUmbers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0;
		System.out.println("Even NUmbers present between "+num1+" and "+num2);
		for(int i=num1 ;i<=num2;i++) {
			if(i %  2 ==0) {
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println("Their sum is "+sum);
	}
}
