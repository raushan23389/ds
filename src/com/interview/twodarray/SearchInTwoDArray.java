package com.interview.twodarray;

import java.util.Scanner;

public class SearchInTwoDArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr =new int[n][n];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int searchValue = scan.nextInt();
		
		int i = 0;
		int j = arr[0].length -1;
		
		while(i<arr.length && j>=0) {
			if(searchValue == arr[i][j]) {
				System.out.println(i);
				System.out.println(j);
				return;
			}
			else if(searchValue<arr[i][j]) {
				j--;
			}
			else {
				i++;
			}
		}
		
		System.out.println("not found");
	}
}
