/**
 * Magic Date Rules
 * 
 * if month * date is one digit and matched with last digit of year
 * if month * date is two digit and matched with last two digits of year
 * if month * date is three digit and match with last three digits of year
 */


package com.logic.lbp;

import java.util.Arrays;
import java.util.Scanner;

public class L046MagicDateVersion2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		String[] dateArray=date.split("-");
		System.out.println("Splitted date is "+Arrays.toString(dateArray));
		if(dateArray[2].endsWith(Integer.toString((Integer.parseInt(dateArray[0]))*(Integer.parseInt(dateArray[1])))))
				System.out.println("Magic Date");
		else
			System.out.println("Not MAgic Date");
				
				
	
	}
}
