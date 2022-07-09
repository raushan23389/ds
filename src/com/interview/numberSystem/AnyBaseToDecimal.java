package com.interview.numberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();
		int d = getValueInDecimal(n, b);
		System.out.println(d);
		
	}
	
	public static int getValueInDecimal(int n, int b) {
		 int rv = 0;
		 int p = 1;
		 while(n>0) {
			 int digit = n % 10;
			 n = n/10;
			 
			 rv = rv + digit * p;
			 p = p*b;
		 }
		 return rv;
	}
}
