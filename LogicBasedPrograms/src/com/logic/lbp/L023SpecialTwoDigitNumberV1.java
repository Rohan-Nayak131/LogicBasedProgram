
/*
A SpecialTwoDigit Number is
	Sum of its digit + Product of its digit =Original Number
	eg:-59 ,  (5+9)+(5*9)=14+45=59
*/
package com.logic.lbp;

import java.util.Scanner;

public class L023SpecialTwoDigitNumberV1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int d,sum=0,mul=1,n=num;
		while(n != 0 ) {
			d= n% 10;
			sum=sum+d;
			mul=mul*d;
			n=n/10;
		}
		if(num == (sum+mul)) {
			System.out.println(num+" is a Special Two Digit NUmber");
			
		}
		else
			System.out.println(num+" is not special two digit number");
	}
}
