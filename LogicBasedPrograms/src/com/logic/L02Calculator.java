package com.logic;

import java.util.Scanner;

public class L02Calculator
{
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		L02Calculator l=new L02Calculator();
		System.out.println("Welcome to Calculator App");
		Thread.sleep(2000);
		System.out.println("Enter the first nnumber");
		double a=sc.nextDouble();
		Thread.sleep(2000);
		System.out.println("Enter the second number");
		double b=sc.nextDouble();
		Thread.sleep(2000);
		System.out.println("Enter the option to perfom calculation");
		System.out.println("1.Addition            2.Substraction");
		System.out.println("3.Multiplication      4.Division");
		System.out.println("5.Reminder            6.Power");
		int option=sc.nextInt();
		double result=0;
		
		switch(option) {
		
		case 1:
			result=l.add(a, b);
			break;
		case 2:
			result=l.sub(a, b);
			break;
		case 3:
			result=l.mul(a, b);
			break;
		case 4:
			result=l.div(a, b);
			break;
		case 5:
			result=l.rem(a, b);
			break;
		case 6:
			result=l.pow(a, b);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		System.out.print("Performing Calculation please standby");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		System.out.println("Result is "+result);
		sc.close();
	}
	
	public double add(double a ,double b) {
		return a+b;
	}
	
	public double sub(double a ,double b) {
		return a>b?a-b:b-a;
	}
	
	public double mul(double a ,double b) {
		return a*b;
	}
	
	public double div(double a,double b) {
		return a/b;
	}
	public double rem(double a,double b) {
		return a%b;
	}
	public double pow(double a,double b) {
		return Math.pow(a, b);
	}
}
