package com.interview.twodarray;

import java.util.Scanner;

public class ExitPointOfMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int column = scan.nextInt();
		int[][] arr = new int[row][column];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		int direction = 0;
		int i =0;
		int j= 0;
		while(true) {
			
			direction = (direction +arr[i][j]) %4;
			if(direction==0) {
				j++;
			}
			else if(direction == 1) {
				i++;
			}
			else if(direction == 2) {
				j--;
			}
			else if(direction==3) {
				i--;
			}
			
			if(i<0) {
				i++;
				break;
			}
			else if(j<0) {
				j++;
				break;
			}
			else if(i == arr.length) {
				i--;
				break;
			}
			else if(j== arr[0].length) {
				j--;
				break;
			}
		}
		
		System.out.println(i);
		System.out.println(j);
	}
}
