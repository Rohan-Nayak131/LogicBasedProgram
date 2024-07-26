/**
 * You are given coordinates ,a String that represents the coordinates of a
 * square of the chess board.
 * Return true if the square is white
 * Return false if the square is black
 * The coordinates will always have the letter first and the number second.
 * 
 *  input------->a string
 *  constraint-->length of string is 2 ,a<=c[0]<=h & 1<=c[1]<=8
 *  output------>true or false
 */



package com.logic.lbp;

import java.util.Scanner;

public class L061DetermineColorOfChessBoard {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int x=Integer.valueOf(s.charAt(0)-96);
		System.out.println(x);
		int y=s.charAt(1);
		System.out.println(y);
		System.out.println(x % 2 != y % 2);
	}
}
