package com.logic.lbp;

import java.util.Scanner;

public class L018July15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		sc.nextLine();
		String month=sc.nextLine();
		
		System.out.println((day==15 && month.equalsIgnoreCase("july"))?"Matched":"Not Matched");
	} 
}
