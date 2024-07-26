/*n is odd 					 	wired
n is even in range of 2 to 5 	not wired
n is even in range of 6 to 20	wired
n is even greater than 20 		not wired
*/

package com.logic.lbp;

import java.util.Scanner;

public class L002WiredOrNotwired {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n % 2 !=0)
			System.out.println("Wired");
		else {
			if(n>=2 && n<=5)
				System.out.println("NOt Wired");
			else if(n>=6 && n<=20 )
				System.out.println("Wired");
			else
				System.out.println("Wired");
		}
		sc.close();
	}
	
}
