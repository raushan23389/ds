package com.learning.recursion;

import java.util.Scanner;

public class MaxOfArray {
	 public static void main(String[] args) throws Exception {
		 Scanner scan = new Scanner(System.in);
		  int n = scan.nextInt();
	       int arr [] = new int [n];
	       for(int i=0;i<arr.length;i++) {
	    	   arr[i] =scan.nextInt();
	       }
	      int max= maxOfArray(arr, 0);
	      System.out.println(max);
	    }

	    public static int maxOfArray(int[] arr, int idx){
	    	if(idx==arr.length-1) {
	    		return arr[idx];
	    	}
	        int misa = maxOfArray(arr, idx+1);
	        if(misa > arr[idx]) {
	        	return misa;
	        }else {
	        	return arr[idx];
	        }
	    }

}
