package com.logic.lbp;

import java.util.Scanner;

public class L076LongestWordV2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] s=sc.nextLine().split(" ");
		int count=0;
		String longWord="";
		for(int i=0;i<s.length;i++) {
			if(s[i].length() > count) {
				count=s[i].length();
				longWord=s[i];
			}
		}
		System.out.println("Longets word is "+longWord);
		System.out.println("Length is "+count);
	}
}
