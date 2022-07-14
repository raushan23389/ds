package com.interview.twodarray;

import java.util.Scanner;

public class SpiralDisplay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column= scan.nextInt();
		int[][] arr =new int[row][column];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int minRow = 0;
		int minColumn = 0;
		
		int maxRow = arr.length-1;
		int maxColumn = arr[0].length-1;
		int totalElement = row*column;
		int count = 0;
		while(count <totalElement) {
			
			//left wall
			for(int i=minRow, j =minColumn; i<=maxRow && count<totalElement;i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minColumn++;
			//bottom wall
			for(int j=minColumn, i = maxRow; j<=maxColumn && count<totalElement;j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxRow--;
			//right wall
			
			for(int i = maxRow, j = maxColumn; i>=minRow && count<totalElement;i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxColumn--;
			//top wall
			for(int j = maxColumn, i = minRow; j>=minColumn && count<totalElement;j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minRow++;
		}
	}
}
