package com.logic.lbp;

import java.util.Scanner;

public class L036FirstCapitalLetterOfAString {

	
	public  void firstCapitalLetter(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				System.out.println(s.charAt(i));
				
				return;
			}
			else
				count++;
		}
		if(count !=0)
			System.out.println("No capital letters");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		new L036FirstCapitalLetterOfAString().firstCapitalLetter(s);
		//System.out.println(new L036FirstCapitalLetterOfAString().firstCapitalLetter(s));
		
	}
}
