package com.logic.lbp;

import java.util.Scanner;

public class L051DefangingIPV3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch1=s.toCharArray();
		char[] ch2=new char[ch1.length*3];
		int index=0;
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i] == '.') {
				ch2[index++]='[';
				ch2[index++]='.';
				ch2[index++]=']';
			}
			else
				ch2[index++]=ch1[i];
		}
		System.out.println(ch2);
		
	}
}
