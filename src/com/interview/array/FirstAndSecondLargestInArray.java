package com.interview.array;

import java.util.Scanner;

public class FirstAndSecondLargestInArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int firstLargest = arr[0];
		int secondLargest = arr[1];
		int temp = 0;
		
		if(firstLargest < secondLargest) {
			temp = firstLargest;
			firstLargest = secondLargest;
			secondLargest = temp;
		}
		
		for(int i=2;i<arr.length;i++) {
			
			if(arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != firstLargest){
				secondLargest = arr[i];
			}
		}
		
		
		System.out.println ("The First largest is " + firstLargest);
		System.out.println ("The First largest is " + secondLargest);
	}
	
}
