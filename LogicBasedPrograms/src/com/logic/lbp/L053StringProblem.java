
/*
 * Given a string s and an integer array indices of same  length
 * The String will be shuffled such that character at ith position moves to 
 * indices[i] in the shuffled string and return the shuffled string
 * ex::
 *  aiohn
 *  31420
 *  --------------->nihao
 *                  01234
 */



package com.logic.lbp;

import java.util.Scanner;

public class L053StringProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int[] arr=new int[s.length()];
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		char[] b=new char[s.length()];
		for(i=0;i<b.length;i++) {
			b[arr[i]]=s.charAt(i);
		}
		System.out.println(b);
	}
}
