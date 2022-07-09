package com.interview.basicMath;

import java.util.Scanner;

public class DigitOfNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	int noofDigit = 0;
	int temp =n;
	
	while(temp!=0) {
		temp = temp/10;
		noofDigit++;
	}
	
	int div = (int)Math.pow(10, noofDigit-1);
	
	while(div!=0) {
		int q = n/div;
		System.out.println(q);
		
		 n = n%div;
		div = div/10;
	}
}
	
}
