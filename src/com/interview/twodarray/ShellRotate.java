package com.interview.twodarray;

import java.util.Scanner;

public class ShellRotate {
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
		
		int shell = scan.nextInt();
		int rotate = scan.nextInt();
		
		rotateShell(arr,shell,rotate);
		display(arr);
				
	}
	 private static void rotateShell(int[][] arr, int shell, int rotate) {
		int [] oned = fillOnedFromShell(arr,shell);
		rotate(oned,rotate);
		fillShellFromOned(arr,shell,oned);
		
	}
	private static void fillShellFromOned(int[][] arr, int shell, int[] oned) {
		// TODO Auto-generated method stub
		int minRow = shell-1;
		int minColumn = shell -1;
		
		int maxRow = arr.length - shell;
		int maxColumn = arr[0].length - shell;
		
		int index =0;
		// leftwall
		for(int i = minRow, j = minColumn; i<=maxRow;i++) {
			arr[i][j] = oned[index];
			index++;
		}
		
		//bottom wall
		for(int i = maxRow, j = minColumn+1; j<=maxColumn;j++) {
			arr[i][j] = oned[index];
			index++;
		}
		//right wall
		for(int i = maxRow-1, j = maxColumn; i>=minRow;i--) {
			arr[i][j] = oned[index];
			index++;
		}
		//top wall
		for(int i = minRow, j = maxColumn-1; j>=minColumn+1;j--) {
			arr[i][j] = oned[index];
			index++;
		}
		
		
		
		
	}
	private static void rotate(int[] oned, int rotate) {
		 rotate = rotate % oned.length;
		 if(rotate<0){
			 rotate = rotate + oned.length; 
		 }
		 
		 reverse(oned,0,oned.length-rotate-1);
		 reverse(oned,oned.length-rotate,oned.length-1);
		 reverse(oned,0,oned.length-1);
	}
	private static void reverse(int[] oned, int i, int j) {
		while(i<j) {
			int temp = oned[i];
			oned[i] =oned[j];
			oned[j] = temp;
			
			i++;
			j--;
		}
		
	}
	private static int[] fillOnedFromShell(int[][] arr, int shell) {
		int minRow = shell-1;
		int minColumn = shell -1;
		
		int maxRow = arr.length - shell;
		int maxColumn = arr[0].length - shell;
		
		int shellSize = 2*(maxRow-minRow + maxColumn - minColumn);
		int[] oned = new int[shellSize];
		int index =0;
		// leftwall
		for(int i = minRow, j = minColumn; i<=maxRow;i++) {
			oned[index] = arr[i][j];
			index++;
		}
		
		//bottom wall
		for(int i = maxRow, j = minColumn+1; j<=maxColumn;j++) {
			oned[index] = arr[i][j];
			index++;
		}
		//right wall
		for(int i = maxRow-1, j = maxColumn; i>=minRow;i--) {
			oned[index] = arr[i][j];
			index++;
		}
		//top wall
		for(int i = minRow, j = maxColumn-1; j>=minColumn+1;j--) {
			oned[index] = arr[i][j];
			index++;
		}
		
		return oned;
	}
	public static void display(int[][] arr){
	        for(int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr[0].length; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
