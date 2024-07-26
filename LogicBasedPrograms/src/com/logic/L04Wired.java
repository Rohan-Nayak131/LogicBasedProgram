package com.logic;

import java.util.Scanner;

public class L04Wired {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n % 2 != 0)
			System.out.println("Wired");
		else {
			if(n>=2 && n<=5)
				System.out.println("Not Wired");
			else if(n>=6 && n<=20)
				System.out.println("Wired");
			else
				System.out.println("Not Wired");
		}
	}
}

