package com.logic.lbp;

import java.util.Scanner;

public class L013NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt(),count=0;
		
		if(n == 0)
			count++;
		while(n != 0) {
			
			count++;
			n = n/ 10;
		}
		System.out.println(count);
	}
}
