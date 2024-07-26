/*  Base of Decimal is 10
  	Base of Binary  is  2
  	Base of Octal   is  8

  	so we need to do operation like %2 or /2 for binary
*/


package com.logic.lbp;

import java.util.Scanner;

public class L019DecimalToBinary {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),digit,i=0;
		int a[]=new int[10];
		
		while(n !=0) {
			digit =n % 2;
			a[i++]=digit;
			n=n/10;
		}
		for(i=i-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}
}
