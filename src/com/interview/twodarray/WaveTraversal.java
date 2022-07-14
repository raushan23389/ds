package com.interview.twodarray;

import java.util.Scanner;

public class WaveTraversal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		int[][] arr = new int[row][column];
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = scan.nextInt(); 
			}
		}
		
		for(int j=0;j<arr[0].length;j++) {
			if(j%2==0) {
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i][j]);
				}
			}
			else {
				for(int i=arr.length-1;i>=0;i--) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
	}
}
