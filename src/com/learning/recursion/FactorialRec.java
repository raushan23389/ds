package com.learning.recursion;

import java.util.Scanner;

public class FactorialRec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int f = factorial(n);
		System.out.println(f);
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		int f = factorial(n-1);
		return(n*f);
		
	}
}
