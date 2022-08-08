package com.learning.recursion;

import java.util.Scanner;

public class PowerLinear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		System.out.println(power(x, n));
	}
	
	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int value = power(x,(n-1));
		return x*value;
		
		
	}
}
