package com.interview.twodarray;

import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int[][] one = new int[r1][c1];
		for(int i = 0;i<one.length;i++) {
			for(int j =0;j<one[0].length;j++) {
				one[i][j] = scan.nextInt();
			}
		}
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		int[][] two = new int[r2][c2];
		for(int i = 0;i<two.length;i++) {
			for(int j =0;j<two[0].length;j++) {
				two[i][j] = scan.nextInt();
			}
		}
		
		if(c1!=r2) {
			System.out.println("Invalid input");
		}
		
		int[][] prod = new int[r1][c2];
		
		for(int i=0;i<prod.length;i++) {
			for(int j=0;j<prod[0].length;j++) {
				for(int k=0;k<c1;k++) {
					prod[i][j] = prod[i][j] + one[i][k] * two[k][j];
				}
			}
		}
		
		for(int i=0;i<prod.length;i++) {
			for(int j=0;j<prod[0].length;j++) {
				System.out.print(prod[i][j] + " ");
			}
			System.out.println();
		}
}
}
