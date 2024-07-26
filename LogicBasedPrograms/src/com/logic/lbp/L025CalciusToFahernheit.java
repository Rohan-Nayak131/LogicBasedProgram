package com.logic.lbp;

import java.util.Scanner;

public class L025CalciusToFahernheit {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int cal=sc.nextInt();
		int fah= (cal*9/5) + 32;
		
		System.out.println(fah);
	}
}
