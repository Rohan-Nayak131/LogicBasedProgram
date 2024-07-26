package com.logic.lbp;

import java.util.Scanner;

public class L073ValidZipCodeV2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		try {
			int n=Integer.parseInt(s);
			
			if(n>9999 && n< 100000) {
				System.out.println("Valid zip");
			}
			else {
				System.out.println("Invalid Zip");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid zip");
		}
	}
}
