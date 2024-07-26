/*
 * Andy, Ben, and Charlotte are playing a board game.Three of them decided to
 * come up with a new scoring system.
 * A player's first initial (A, B & C) denotes that the player scoring single
 * point.Given a string of capital letters returns an array of the player's
 * scores
 */

package com.logic.lbp;

import java.util.Scanner;

public class L068BoardGame {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			int a=0,b=0,c=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == 'A')
					a++;
				if(s.charAt(i) == 'B')
					b++;
				if(s.charAt(i) == 'C')
					c++;
			}
			System.out.println(a+" "+b+" "+c);
		}
	}
}
