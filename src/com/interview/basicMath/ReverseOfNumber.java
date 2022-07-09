package com.interview.basicMath;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n > 0) {
			int digit  = n%10;
			n = n/10;
			System.out.println(digit);
		}
	}
}
