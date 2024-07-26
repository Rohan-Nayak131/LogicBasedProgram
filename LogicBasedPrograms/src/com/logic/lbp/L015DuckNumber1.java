/* Number Of zeros in a Integer but not at beginning
 * If a number begins with zero it is a octal number
 * */ 


package com.logic.lbp;

import java.util.Scanner;

public class L015DuckNumber1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),digit;
		int no=n;
		boolean flag=false;
		while(n != 0) {
			digit=n%10;
			if(digit == 0)
				flag=true;
			n=n/10;
			
		}
		if(flag)
			System.out.println(no+" is Duck number");
		else
			System.out.println(no+" is not Duck number");
	}
}
