package com.logic.lbp;

import java.util.Scanner;

public class L056ShuffleNamesV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1;
				s1=s2;
				s2=s3;
		System.out.println(s1+" "+s2);
	}
}
