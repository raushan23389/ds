package com.interview.array;

import java.util.Scanner;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int d = scan.nextInt();
		int lastIndex = -1;
		int low =0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(d  < arr[mid]) {
				high = mid-1;
			}
			else if(d > arr[mid]) {
				low = mid +1;
			}
			else {
				lastIndex = mid;
				low = mid + 1;
				}
			}
		
		int firstIndex = -1;
		int lo = 0;
		int hig = arr.length - 1;
		while(lo<=hig) {
			int mid = (lo+hig)/2;
			
			if(d > arr[mid]) {
				lo = mid+1;
			}
			else if(d < arr[mid]) {
				hig = mid -1;
			}
			else {
				firstIndex = mid;
				hig = mid -1;
			}
		}
		
		System.out.println(lastIndex);
		System.out.println(firstIndex);
		}
		
		
	}
	
	

