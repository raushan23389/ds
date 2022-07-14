package com.interview.array;
import java.util.Scanner;

public class CeilAndFloorProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int d = scan.nextInt();
		ceilAndFloor(arr, d);
	}
	
	public static void ceilAndFloor(int[] arr,int d) {
		int low =0;
		int high = arr.length-1;
		int ceil =0;
		int floor =0;
		while(low<=high) {
			int mid = (low+high)/2;
			
		if(d < arr[mid]) {
			high = mid-1;
			ceil = arr[mid];
			
		}
		else if(d > arr[mid]) {
				low = mid+1;
				floor = arr[mid];
			}
		else {
			ceil = arr[mid];
			floor=arr[mid];
			break;
		}
			
		}
		System.out.println(ceil);
		System.out.println(floor);
	}
}
