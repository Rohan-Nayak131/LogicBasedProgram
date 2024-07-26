package com.logic.lbp;

import java.util.Scanner;

public class L039BlackJackFunction {

	public static int blackJack(int num1,int num2) {
		if(num1 > 21 && num2 > 21)
			return 0;
		else if(num1 >21)
			return num2;
		else if(num2 > 21)
			return num1;
		else
			return Math.max(num1, num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(blackJack(num1, num2));
	}
}
