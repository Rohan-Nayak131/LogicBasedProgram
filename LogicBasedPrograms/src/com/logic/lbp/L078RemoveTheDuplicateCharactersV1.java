package com.logic.lbp;

import java.util.Scanner;

public class L078RemoveTheDuplicateCharactersV1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String s=scanner.nextLine();
		
		String rs="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(rs.indexOf(c)< 0) {
				/*
				 * basically in this condition ::
				 * suppose s=java
				 * rs initially is empty
				 * now rs.indexOf(c)=>rs.indexOf('j')=>-1
				 * now rs.indexOf(c)=>rs.indexOf('a')=>-1
				 * now rs.indexOf(c)=>rs.indexOf('v')=>-1
				 * now rs.indexOf(c)=>rs.indexOf('a')=> 1
				 */
				rs=rs+c;
			}
			
		}
		System.out.println(rs);
	}
}
