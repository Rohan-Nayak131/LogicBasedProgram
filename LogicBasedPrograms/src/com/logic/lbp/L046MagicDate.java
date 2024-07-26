/**
 * Magic Date Rules
 * 
 * if month * date is one digit and matched with last digit of year
 * if month * date is two digit and matched with last two digits of year
 * if month * date is three digit and match with last three digits of year
 */


package com.logic.lbp;

import java.util.Scanner;

public class L046MagicDate {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Date entered is:: "+d+"-"+m+"-"+y);
		if((m*d == y%10)||(m*d == y%100)||(m*d == y%1000))
			System.out.println("The date magic date");
		else
			System.out.println("The date is not magic date");
	}
}
