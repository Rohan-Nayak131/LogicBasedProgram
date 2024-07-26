/**
 * 12:92 mins and secs
 * 812 secs
 */

package com.logic.lbp;

import java.util.Scanner;

public class L048VideoLengthV1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s1=obj.nextLine();
		int n1,n2;
		if(s1.charAt(0)==0)
			n1= Integer.parseInt(s1.substring(1, 2));
		else
			n1=Integer.parseInt(s1.substring(0,2));
		
		if(s1.charAt(3)==0)
			n2=Integer.parseInt(s1.substring(4));
		else
			n2=Integer.parseInt(s1.substring(3));
		
		System.out.println("The video length in secs "+(n1*60+n2));
	}
}
