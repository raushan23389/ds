package com.interview.dp;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int n = scan.nextInt();
		//System.out.println(fibonacciRecursion(n));
		System.out.println(fibonacciRecursionMemorized(n, new int[n+1]));
	}

	private static int fibonacciRecursion(int n) {
		
		if(n ==0 || n==1) {
			return n;
		}
		int f1 =fibonacciRecursion(n-1);
		int f2= fibonacciRecursion(n-2);
		int fib = f1+f2;
		return fib;
		
	}
	
	private static int fibonacciRecursionMemorized(int n, int[] questionBank) {
		
		if(n ==0 || n==1) {
			return n;
		}
		if(questionBank[n] !=0) {
			return questionBank[n];
		}
		int f1 =fibonacciRecursionMemorized(n-1,questionBank );
		int f2= fibonacciRecursionMemorized(n-2, questionBank);
		int fib = f1+f2;
		questionBank[n] = fib;
		return fib;
		
	}
}
