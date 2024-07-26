/**
 * If sum of digits of a number is odd then the number is oddish
 * else evenish
 */


package com.logic.lbp;

import java.util.Scanner;

public class L047OddishorEvenish {

	public static void check(int num) {
		int sum=0;
		int n=num;
		while(num != 0) {
			sum=sum+(num % 10);
			num=num/10;
		}
		if(!(sum % 2 ==0))
			System.out.println(n+" is Oddish");
		else
			System.out.println(n+" is Evenish");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		check(num);
	}
}
