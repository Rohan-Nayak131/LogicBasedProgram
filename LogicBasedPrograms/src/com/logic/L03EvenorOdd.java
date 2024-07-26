package com.logic;

import java.util.Scanner;

public class L03EvenorOdd {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>=0) {
		if(n % 2 == 0)
			System.out.println("The number "+n+" is Even Number");
		else
			System.out.println("The number "+n+" is Odd Number");
		}
		else
			System.out.println("Invalid number entered");
		
		sc.close();
	}
	

}
