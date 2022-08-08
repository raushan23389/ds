package com.learning.recursion;

import java.util.Scanner;

public class DisplayArrayReverse {
	 public static void main(String[] args) throws Exception {
		 Scanner scan = new Scanner(System.in);
		  int n = scan.nextInt();
	       int arr [] = new int [n];
	       for(int i=0;i<arr.length;i++) {
	    	   arr[i] =scan.nextInt();
	       }
	       displayArrReverse(arr, 0);
	    }

	    public static void displayArrReverse(int[] arr, int idx) {
	    	if(idx==arr.length) {
	    		return;
	    	}
	    	displayArrReverse(arr, idx+1);
	    	System.out.println(arr[idx]);
	    }
}
