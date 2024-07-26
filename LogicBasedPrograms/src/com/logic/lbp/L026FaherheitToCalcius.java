package com.logic.lbp;

import java.util.Scanner;

public class L026FaherheitToCalcius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int fah=sc.nextInt();
		int cal= (fah-32)* 5/9;
		System.out.println(cal);
	}
}
