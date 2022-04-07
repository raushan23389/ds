package com.learning.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(iterativeFactorial(num));
	}
	
	public static int iterativeFactorial(int num) {
		if(num==0) {
			return 1;
		}
		
		int factorial =1;
		for(int i=1; i<=num; i++) {
			factorial *=i;
		}
		return factorial;
	}
	//1! = 1 * 0! = 1
	//2! = 2 * 1 = 2 * 1!
	//3! = 3 * 2 * 1 = 3 * 2!
	//n! = n *(n-1)!
	public static int recursiveFactorial(int num) {
		if(num==0) {
			return 1;
		}
		return num * recursiveFactorial(num-1);
	}
	
}
