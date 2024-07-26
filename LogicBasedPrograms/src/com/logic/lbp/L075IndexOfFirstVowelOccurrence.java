package com.logic.lbp;

import java.util.Scanner;

public class L075IndexOfFirstVowelOccurrence {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine().toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c == 'a' || c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println("The first vowel is "+s.charAt(i)+
						",its index is at "+(i+1));
				break;
			}
				
		}
	} 
}
