package com.interview.numberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();
		int dn = getValueInBase(n, b);
		System.out.println(dn);
	}
	
	public static int getValueInBase(int n, int b) {
		int rv = 0;
		int p = 1;
		
		while(n>0) {
			int digit = n %b;
			n = n/b;
			
			rv = rv + digit * p;
			p=p*10;
		}
		return rv;
	}
}
