/*Generate a 4 digit PIN using 3 numbers
Unit place -min of three digits 
Ten place -min of 3 digits
Hundred place=minof 3 digits
Thousand place is max of max digit of 3 numbers
*/


package com.logic.lbp;

import java.util.Scanner;

public class L031PINGeneration {

	public static int maxdigit(int n) {
		int max=0,d;
		while(n!=0) {
			d=n %10;
			if(d >max)
				max=d;
			n=n/10;
		}
		return max;
	}
	public static void main(String[] args) {
		int unit,ten,hun,tho;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number");
		int c=sc.nextInt();
		
		unit= Math.min(Math.min(a%10, b%10),c%10);
		ten= Math.min(Math.min((a/10)%10, (b/10)%10),(c/10)%10);
		hun= Math.min(Math.min((a/100)%10, (b/100)%10),(c/100)%10);
		tho= Math.max(Math.max(maxdigit(a), maxdigit(b)),maxdigit(c));
		System.out.println("PIN Generated as");
		int pin=tho*1000+hun*100+ten*10+unit;
		System.out.println(pin);
		
	}
}
