package com.interview.basicMath;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int f = getDigitFrequency2(n, d);
		System.out.println(f);
	
	}
	
	public static int getDigitFrequency(int n,int d) {
		int temp = n;
		int noOfdigit = 0; 
		int digitFrequency = 0;
		while(temp!=0) {
			temp = temp/10;
			noOfdigit++;	
		}
		
		int divisor = (int)Math.pow(10, noOfdigit-1);
		
		while(divisor!=0) {
			int quotient = n/divisor;
			if(quotient==d) {
				digitFrequency++;
			}
			n = n%divisor;
			divisor = divisor/10;
		}
		return digitFrequency;
	}
	
	public static int getDigitFrequency2(int n,int d) {
		int rv = 0;
		while(n>0){
			int dig = n%10;
			n = n/10;
			if(dig==d) {
				rv++;
			}
		}
		return rv;
	} 
}
