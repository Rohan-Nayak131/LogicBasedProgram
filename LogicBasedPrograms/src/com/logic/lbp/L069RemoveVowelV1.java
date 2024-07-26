package com.logic.lbp;

import java.util.Scanner;

public class L069RemoveVowelV1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			/*
			 * if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'))
				System.out.print(s.charAt(i));
			 */
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				continue;
			else
				System.out.print(s.charAt(i));
		}
		scanner.close();
	}
}
