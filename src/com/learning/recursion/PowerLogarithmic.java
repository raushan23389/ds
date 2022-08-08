package com.learning.recursion;

import java.util.Scanner;

public class PowerLogarithmic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		System.out.println(power(x, n));
	}
	
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int xn2 = power(x, n/2);
		int pl = xn2*xn2;
		
		if(n%2==1) {
			pl = x*pl;
		}
		
		return pl;
	}
}
