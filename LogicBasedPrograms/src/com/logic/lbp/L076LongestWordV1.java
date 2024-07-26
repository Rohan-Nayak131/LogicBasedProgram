package com.logic.lbp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class L076LongestWordV1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String longestWord="";
		StringTokenizer st=new StringTokenizer(s);
		int m=0;
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			if(token.length() > m) {
				m=token.length();
				longestWord=token;
			}
		}
		System.out.println("The longest word in " + s + " is *"
                + longestWord + "* which has length " + m);

	}
}
