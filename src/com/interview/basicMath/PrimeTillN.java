package com.interview.basicMath;

import java.util.Scanner;

public class PrimeTillN {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int low = scan.nextInt();
		int high = scan.nextInt();
		
		for(int n = low;n<=high;n++) {
			
			int count =0;
			for(int div = 2; div*div<=n; div++) {
				if(n % div==0) {
					count++;
					break;
				}
			}
			
			if(count==0) {
				System.out.println(n);
			}
		}
	}
}
