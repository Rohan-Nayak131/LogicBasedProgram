/*Take Three numbers 
-----------------------
second number must be greater than first and third number
increment first number until it is equal to  second number
decrement the third number until it is equal to second
eg:- 5 9 6
5+6+7+8+9+8+7+6=56
-------->
        -------->
*/
package com.logic.lbp;

import java.util.Scanner;

public class L027FindTheSequence {
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		int sum=0,n1,n2,n3;
		System.out.println("Eneter 1st number");
		n1=sc.nextInt();
		System.out.println("Enter 3rd number");
		n3=sc.nextInt();
		while(true) {
		System.out.println("Enter 2nd nmber");
		n2=sc.nextInt();
		if(n2>n1 && n2 >n3)
			break;
		else
			System.out.println("Second number must be greater than First and Third number");
		}
		
		while(n1 < n2) {
			sum=sum+n1;
			n1++;
			System.out.println(sum);
		}
		while(n2 >= n3) {
			sum=sum+n2;
			n2--;
			System.out.println(sum);
		}
		System.out.println("The sum of sequence is "+sum);
	}
	

}
