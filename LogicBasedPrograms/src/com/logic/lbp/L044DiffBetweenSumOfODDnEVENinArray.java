package com.logic.lbp;

import java.util.Arrays;
import java.util.Scanner;

public class L044DiffBetweenSumOfODDnEVENinArray {

	public static int diff(int[] arr) {
		int sumE=0,sumO=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 ==0)
				sumE=sumE+arr[i];
			else
				sumO=sumO+arr[i];
			
		}
		return Math.abs(sumO-sumE);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		System.out.println("Differenec is "+diff(arr));
		
	}
	
}
