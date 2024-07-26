package com.logic.lbp;

import java.util.Scanner;

public class L051DefangingIPV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String [] as=s.split("\\.");
		System.out.println(String.join("[.]", as));
	
	}
	
}
