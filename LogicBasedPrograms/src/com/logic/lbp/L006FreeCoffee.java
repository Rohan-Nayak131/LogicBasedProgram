/*	For every 6 coffee ,1 cup is free
		13 -> 15
*/

package com.logic.lbp;

import java.util.Scanner;

public class L006FreeCoffee {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		System.out.println(n+(n/6));
	}
}
