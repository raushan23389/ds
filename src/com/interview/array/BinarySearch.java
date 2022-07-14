package com.interview.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = scan.nextInt();
	}
	int value = scan.nextInt();
	
	System.out.println(binarySearch(arr, value));
}

public static int binarySearch(int[] arr, int n) {
	int[] arr2 = Arrays.stream(arr).sorted().toArray();
	int start = 0;
	int end = arr2.length;
	while(start<end) {
		int mid = (start+end)/2;
		if(arr2[mid]==n) {
			return mid;
		}
		else if(arr2[mid] < n) {
			start = mid +1;
		}
		else {
			end = mid;
		}
		
	}
	return -1;
}


}
