package com.logic.lbp;

import java.util.Scanner;

public class L074ReturnMiddleCharacterofaString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		if(s.length()%2 != 0)
			System.out.println(s.charAt(s.length()/2));
		else
			System.out.println(s.charAt((s.length()/2)-1)+" , "+
					s.charAt(s.length()/2));
	}
}
