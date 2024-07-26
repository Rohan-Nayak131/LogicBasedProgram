/*
 	02:54
 	video length in secs 174
 
 */


package com.logic.lbp;

import java.util.Scanner;

public class L048VideoLengthV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n1=0,n2;
		
		if(s.charAt(0)=='0')
			n1=Integer.valueOf(s.charAt(1)-48);
		else
			n1=Integer.valueOf(s.charAt(0)-48)*10+
					Integer.valueOf(s.charAt(1)-48);
		
		if(s.charAt(3)=='0')
			n2=Integer.valueOf(s.charAt(4)-48);
		else
			n2=Integer.valueOf(s.charAt(3)-48)*10+
					Integer.valueOf(s.charAt(4)-48);
		
		System.out.println("Video in secs "+(n1*60 + n2));
	}
}
