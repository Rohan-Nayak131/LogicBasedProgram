/*Validate Email
email starts with alphabets
email ends with a single digit or single underscore then followed by '@gmail.com'
eg:- abc9@gmail.com
     gag_@gmail.com
*/


package com.logic.lbp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L034EmailValidate {
 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		
		Pattern p=Pattern.compile("[a-z]+[0-9|_]@gmail.com");
		
		Matcher m=p.matcher(s);
		if(m.find() && (m.group().equals(s)))
			System.out.println(s+" is a valid email");
		else
			System.out.println(s+" is not a valid email");
	}
}
