package com.interview.twodarray;

import java.util.Scanner;

public class SaddlePrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr =new int[n][n];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			int smallestValueInJ = 0;
			
			for(int j=1;j<arr[0].length;j++) {
				if(arr[i][j] <arr[i][smallestValueInJ]) {
					smallestValueInJ = j;
				}
			}
			
			boolean flag = true;
			for(int k =0;k<arr.length;k++) {
				if(arr[k][smallestValueInJ] > arr[i][smallestValueInJ]) {
					flag = false;
					break;
				}
			}
			
			if(flag==true) {
				System.out.println(arr[i][smallestValueInJ]);
				return;
			}
			
			
		}
		System.out.println("invalid input");
	}
}
