package com.learning.recursion;

import java.util.Scanner;

public class LastIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  int n = scan.nextInt();
	     int arr [] = new int [n];
	     for(int i=0;i<arr.length;i++) {
	  	   arr[i] =scan.nextInt();
	     }
	     int d = scan.nextInt();
	     int li = lastIndex(arr, 0, d);
	     System.out.println(li);
	}
	
	 public static int lastIndex(int[] arr, int idx, int x){
	      if(idx == arr.length) {
	    	  return -1;
	      }
		 int liisa = lastIndex(arr, idx+1, x);
		 if(liisa == -1) {
			 if(arr[idx]==x) {
				 return idx;
			 }else {
				 return -1;
			 }
		 }else {
			 return liisa;
		 }
	    }
}
