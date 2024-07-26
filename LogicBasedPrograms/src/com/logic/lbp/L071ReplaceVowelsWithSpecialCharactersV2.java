package com.logic.lbp;

import java.util.Scanner;

public class L071ReplaceVowelsWithSpecialCharactersV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		//for $ and \ use \$ or \\
		System.out.println(s1.replaceAll("[aeiouAEIOU]", s2));
	}
}
