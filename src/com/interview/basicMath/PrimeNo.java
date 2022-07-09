package com.interview.basicMath;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i=0;i<t;i++) {
			int n = scan.nextInt();
			int count =0;
			for(int div =2;div<=n/2;div++) {
				if(n%div==0) {
					count++;
					break;
				}
			}
			if(count==0) {
			System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
		
		
		
	}
}
