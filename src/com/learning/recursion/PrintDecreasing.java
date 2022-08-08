package com.learning.recursion;

import java.util.Scanner;

public class PrintDecreasing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printDecreasing(n);
	}
	
	public static void printDecreasing(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}
}
