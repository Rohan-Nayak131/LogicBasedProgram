/*	125 ->1,2,5
	45  ->4,5
	General way is get like 5,2,1 then reverse
*/
package com.logic.lbp;

import java.util.Scanner;

public class L007ExtractDigitsFromNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt(),digit;
		
		while(no != 0) {  //we don't know how many digits so don't know how many iterations
			digit = no % 10;
			System.out.print(digit+" ");
			no = no / 10;
		}
	}
}
