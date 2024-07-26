package com.logic.lbp;

import java.util.Scanner;

public class L062FindWordV1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println(s.hashCode());
		s=s.toLowerCase();
		System.out.println(s);
		System.out.println(s.hashCode());
		s="Hello";
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s.contains("bomb"));
	}
}
