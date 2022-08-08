package com.learning.recursion;

import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int arr [] = new int [n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i] =scan.nextInt();
       }
       displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx){
    	if(idx==arr.length) {
    		return;
    	}
    	System.out.println(arr[idx]);
    	displayArr(arr, idx + 1);
        
    }
}
