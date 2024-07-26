/*	123 -> 1+2+3 =6
*/

package com.logic.lbp;

import java.util.Scanner;

public class L008SumOfDigits {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt(),digit,sum = 0;
		
		while(no != 0) {
			digit = no % 10;
			sum = sum + digit;
			no = no / 10;
		}
		System.out.println(sum);
	}
}
