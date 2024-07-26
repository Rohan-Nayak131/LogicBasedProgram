package com.logic.lbp;

import java.util.Scanner;

public class L069RemoveVowelV2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		System.out.println(s.replaceAll("[a,e,i,o,u,A,E,I,O,U]", ""));
		scanner.close();
	}
}
