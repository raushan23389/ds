package com.interview.twodarray;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfRows = scan.nextInt();
		int noOfColumns = scan.nextInt();
		int[][] arr = new int[noOfRows][noOfColumns];
		for(int i = 0;i<noOfRows;i++) {
			for(int j =0;j<noOfColumns;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfColumns;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
