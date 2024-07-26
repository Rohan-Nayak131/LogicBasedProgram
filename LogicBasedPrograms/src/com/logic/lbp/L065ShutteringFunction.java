/*
 * Write a function that shutters a word as if someone is struggling to read
 * it.
 * The first two letters are repeated twice with ellipsis (...) and then the
 * word is pronounced with a question mark (?) 
 * 
 * example::incredible
 *          in..in...incredible?  
 */

package com.logic.lbp;

import java.util.Scanner;

public class L065ShutteringFunction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.substring(0,2)+".."+s.substring(0,2)+"..."
				+s+"?");
	}
}
