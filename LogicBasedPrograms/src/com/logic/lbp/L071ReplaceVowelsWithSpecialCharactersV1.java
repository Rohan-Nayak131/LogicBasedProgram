package com.logic.lbp;

import java.util.Scanner;

public class L071ReplaceVowelsWithSpecialCharactersV1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scanner.nextLine();
		//char c=scanner.nextChar();
		/*
		 * There is no predefined method to read char like 
		 * nextInt(),nextFloat,nextLine(),next(),etc.
		 */
		System.out.println("Enter a Character to replace the vowels");
		char c=scanner.nextLine().charAt(0);
		for(int i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u' ||
					p == 'A' || p == 'E' || p == 'I' || p == 'O' || p == 'U' )
				System.out.print(c);
			else
				System.out.print(s.charAt(i));
		}
		scanner.close();
	}
}
