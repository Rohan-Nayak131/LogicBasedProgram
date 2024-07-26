package com.logic.lbp;

import java.util.Scanner;

public class L063NumberOfVowels {

	public int countVowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
				c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int res=new L063NumberOfVowels().countVowels(s);
		System.out.println("Number of vowels in "+s+" is "+res);
		sc.close();
	}
}
