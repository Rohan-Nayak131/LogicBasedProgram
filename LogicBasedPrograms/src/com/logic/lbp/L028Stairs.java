/*You are climbing staircase.It takes n steps to top
Each time you can either climb 1 or 2 steps 
In how many ways  you can climb to the top
Input ---> number
output---> no of ways

*/
package com.logic.lbp;

import java.util.Scanner;

public class L028Stairs {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of stairs");
		int n=sc.nextInt();
		if(n==0)
			System.out.println("no stairs available ");
		else
		System.out.println("No of ways we can climb "+ways(n));
		
	}
	
	public static int ways(int n) {
		
		 if(n==1 || n==0)
			return 1;
		else
			return ways(n-1)+ways(n-2);
		
	}
}
