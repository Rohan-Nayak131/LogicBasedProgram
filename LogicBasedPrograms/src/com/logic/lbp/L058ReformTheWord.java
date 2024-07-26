/*
 * hacker
 * rank
 * -->Hackerrank
 * 
 * rohan
 * nayak
 * -->Rohannayak
 */

package com.logic.lbp;

import java.util.Scanner;

public class L058ReformTheWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s1.substring(0,1).toUpperCase()
				+s1.substring(1)+s2);
	}
}
