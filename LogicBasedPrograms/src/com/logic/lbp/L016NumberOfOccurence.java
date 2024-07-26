package com.logic.lbp;

import java.util.Scanner;

public class L016NumberOfOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		System.out.println("Enter a number to find its occurence");
		int key=sc.nextInt();
		int digit,c=0;
		
		while(n != 0) {
			digit = n %10;
			if(digit == key)
				c++;
			n=n/10;
		}
		System.out.println("Occurence of "+key+" is  "+c);
	}	
	
}
