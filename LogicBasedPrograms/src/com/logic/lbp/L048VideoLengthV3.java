package com.logic.lbp;

import java.util.Scanner;

public class L048VideoLengthV3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] sf=s.split(":");
		System.out.println(Integer.parseInt(sf[0])*60+Integer.parseInt(sf[1]));
	}
}
