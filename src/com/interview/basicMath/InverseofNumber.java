package com.interview.basicMath;

import java.util.Scanner;

public class InverseofNumber {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	int inverse = 0;
	int originalPlace = 1;
	
	while(n!=0) {
		int originalDigit = n%10;
		int inverseDigit = originalPlace;
		int inversePlace = originalDigit;
		
		//make change to inv using ip and id
		inverse = inverse + inverseDigit* (int)Math.pow(10, inversePlace-1);
		
		n = n/10;
		originalPlace++;
	}
	
	System.out.println(inverse);
	
}
	
}
