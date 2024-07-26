/**
 * Perfect Number=>sum of factors=number
 */

package com.logic.lbp;

import java.util.Scanner;

public class L045PerfectNumber {
	
	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		int num=cs.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				sum=sum+i;
			}
		}
		if(sum==num)
			System.out.println(num+" is perfect number");
		else
			System.out.println("Not Perfect NUmber");
	}
}
