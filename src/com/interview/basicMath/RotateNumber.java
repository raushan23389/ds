package com.interview.basicMath;

import java.util.Scanner;

public class RotateNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int temp = n;
		int noOfdigits = 0;
		while(temp>0) {
			temp = temp/10;
			noOfdigits++;
			
		}
		
		k = k%noOfdigits;
		if(k<0) {
			k = k+noOfdigits;
		}
		int divisor =1;
		int multiplier =1;
		for(int  i =1;i<=noOfdigits;i++) {
			if(i<=k) {
				 divisor = divisor * 10;
			}
			else {
				multiplier = multiplier * 10;
			}
		}
		
		int quotient = n/divisor;
		int remainder = n%divisor;
		
		int rotate = remainder*multiplier + quotient;
		System.out.println(rotate);
			
		
	}

}
