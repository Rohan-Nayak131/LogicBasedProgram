
/*A NIven number is a number where 
it is divisible by sum of its digits*/
package com.logic.lbp;

import java.util.Scanner;

public class L022NivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int d,sum=0,n=num;
		
		while(n != 0) {
			d=n % 10;
			sum=sum+d;
			n =n/10;
		}
		if(num % sum ==0)
			System.out.println(num+ " is NIven NUmber");
		else
			System.out.println(num+" is not NIven Number");
	}
}
