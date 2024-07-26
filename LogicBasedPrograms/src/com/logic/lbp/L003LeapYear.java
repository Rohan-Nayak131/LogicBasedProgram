/*Century Year:: divisible by 100
  Leap Year   :: is not century year and is divisible by 4
		      :: is century year and is divisible by 400
*/
package com.logic.lbp;

import java.util.Scanner;

public class L003LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		if((year % 100 != 0 && year % 4 == 0) || (year % 400 ==0 ))
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
	}
}
