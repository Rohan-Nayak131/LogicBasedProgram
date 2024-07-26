/*30-50  D
  51-60  C
  61-80  B
  81-100 A
*/

package com.logic.lbp;

import java.util.Scanner;

public final class L004Ecommerce {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int bookSales=sc.nextInt();
		if(bookSales>=30 && bookSales <= 100) {		

			if(bookSales>=30 && bookSales<=50)
				System.out.println("D");
			else if(bookSales>=51 && bookSales<=60)
				System.out.println("C");
			else if (bookSales >= 61 && bookSales <= 80)
				System.out.println("B");
			else
				System.out.println("A");

		}
	}
}
