/*
 * Write a function that takes a string name and number num (either 0 or 1)
 * and return "Hello"+name if the number is 1 otherwise "Bye"+name
 */
package com.logic.lbp;

import java.util.Scanner;

public class L072SayHelloSayBye {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println((scanner.nextInt()==1)?"Hello"+scanner.next():
			"Bye"+scanner.next());
		scanner.close();
	}
}
