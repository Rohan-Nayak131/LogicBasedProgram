package com.logic.lbp;

import java.util.Scanner;

public class L020FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fib(num));
	}
	
	static int fib(int num) {
		if(num == 0 || num == 1)
			return num;
		else
			return fib(num-1)+ fib(num-2);
	}
}


//display its corresponding fibonacci number 